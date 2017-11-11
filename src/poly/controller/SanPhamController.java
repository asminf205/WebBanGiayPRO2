package poly.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import poly.bean.KhachHang;
import poly.bean.SanPham;
import poly.common.QueryManager;
import poly.constants.SneakerGlobalConstant;
import poly.dao.generic.IGenericDAO;
import poly.utils.CommonUtils;
import poly.utils.QueryUtils;

@Controller
public class SanPhamController {

	@Autowired
	IGenericDAO<SanPham> sanphamDAO;
	
	@Autowired
	ServletContext context;

	int sum=0;
	/**
	 * Show All Product
	 * 
	 * @param model {@link Model}
	 * @param request {@link HttpServletRequest}
	 * @return {@link String}
	 */
	@RequestMapping(value = "/quanlysanpham", method = RequestMethod.GET)
	public String laysanpham(Model model, HttpServletRequest request) {
		model.addAttribute("list", sanphamDAO.getAll());
		return SneakerGlobalConstant.QUAN_LY_SAN_PHAM_PAGE;
	}

	/**
	 * show edit page for admin
	 * 
	 * @param request {@link HttpServletRequest}
	 * @param model {@link Model}
	 * @return {@link String}
	 */
	@RequestMapping(value = "/edit")
	public String editSP(HttpServletRequest request, Model model) {
		int ma = Integer.parseInt(request.getParameter(SneakerGlobalConstant.OBJECT_ID));
		SanPham sp = sanphamDAO.getObj(ma);
		request.setAttribute("SP", sp);
		return SneakerGlobalConstant.SUA_SAN_PHAM_PAGE;
	}

	/**
	 *Show themsanpham.jsp 
	 * 
	 */
	@RequestMapping(value = "/themsanpham")
	public String themsanpham() {
		return SneakerGlobalConstant.THEM_SAN_PHAM_PAGE;
	}
	
	/**
	 * Execute Add New Product
	 * 
	 * @param request {@link HttpServletRequest}
	 * @param image {@link MultipartFile}
	 * @param model {@link Model}
	 * @return {@link String}
	 */
	@RequestMapping(value = "/sanpham/moi", method=RequestMethod.POST)
	public String addProduct(HttpServletRequest request,@RequestParam MultipartFile image, Model model, SanPham sp){
		String imgName = request.getParameter(SneakerGlobalConstant.OBJECT_NAME)+".jpg";
		imgName=CommonUtils.formatString(imgName.split(SneakerGlobalConstant.SPACE));
		if(StringUtils.isEmpty(imgName)){
			return "redirect:/"+SneakerGlobalConstant.THEM_SAN_PHAM_PAGE;
		}
		try {
			image.transferTo(new File(context.getRealPath("/resources/theme/images/")+imgName));
		} catch (IllegalStateException | IOException e) {
			Logger.getLogger(this.getClass()).info(e.getMessage());
		}
		sp.setHinh(imgName);
			sanphamDAO.saveObject(sp);
			return "redirect:/";
	}
	/**
	 * Execute Edit Product Action
	 * 
	 * @param model {@link Model}
	 * @param request {@link HttpServletRequest}
	 * @return {@link String}
	 */
	@RequestMapping(value = "/suasanpham", method = RequestMethod.GET)
	public String suasanpham(Model model, HttpServletRequest request, SanPham sp) {		
		int ma = Integer.parseInt(request.getParameter(SneakerGlobalConstant.OBJECT_ID));
		sp.setMa(ma);
		sanphamDAO.updateObject(sp);
		return "redirect:/";
	}

	/**
	 * Execute Search Action
	 * @param request {@link HttpServletRequest}
	 * @param model {@link Model}
	 * @return {@link String}
	 */
	@RequestMapping("/search")
	public String search(HttpServletRequest request, Model model) {
		model.addAttribute("list", sanphamDAO.executeQuery(QueryUtils.createQueryWithCrit(new SanPham(),new QueryManager(request.getParameterMap())) ) );
		return SneakerGlobalConstant.QUAN_LY_SAN_PHAM_PAGE;
	}
	
	@RequestMapping(value = "/cart")
	public String cart(HttpServletRequest request, Model model,HttpSession session) {
		List<SanPham> list = null;
		
		int ma = Integer.parseInt(request.getParameter(SneakerGlobalConstant.OBJECT_ID));
		SanPham sp = sanphamDAO.getObj(ma);
		if(Objects.isNull(session.getAttribute("listCart"))){
			list=editSession(sp,new ArrayList<>());
			
		}else{
			list=editSession(sp, (List<SanPham>)session.getAttribute("listCart"));
			
		}
		session.setAttribute("listCart", list);
		return "Cart";
	}
	
	/**
	 * Execute Add To Cart Action
	 * @param sp {@link SanPham}
	 * @param lstSp {@link List<SanPham>}
	 * @return {@link List<SanPham>}
	 */
	private List<SanPham> editSession(SanPham sp,List<SanPham> lstSp){
		for(int i=0;i<lstSp.size();i++){
			if(lstSp.get(i).getMa()==sp.getMa()){
				int dongia = lstSp.get(i).getGia()/lstSp.get(i).getSoluong();
				lstSp.get(i).setSoluong(lstSp.get(i).getSoluong()+1);
				lstSp.get(i).setGia(lstSp.get(i).getSoluong()* dongia);
				return lstSp;
			}
		}
		sp.setSoluong(1);
		lstSp.add(sp);
		return lstSp;
	}
	
	@RequestMapping(value = "/deleteSP")
	public String xoasanpham(Model model, HttpServletRequest request) {
			int masp = Integer.parseInt(request.getParameter(SneakerGlobalConstant.OBJECT_ID));
			SanPham sp = sanphamDAO.getObj(masp);
			sanphamDAO.deleteObject(sp);
		return SneakerGlobalConstant.QUAN_LY_SAN_PHAM_PAGE;
	}
}
