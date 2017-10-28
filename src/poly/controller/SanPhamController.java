package poly.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import poly.bean.SanPham;
import poly.constants.SneakerGlobalConstant;
import poly.dao.generic.IGenericDAO;
import poly.utils.CommonUtils;

@Controller
public class SanPhamController {

	@Autowired
	IGenericDAO<SanPham> sanphamDAO;

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
		return "quanlysanpham";
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
		return "editproduct";
	}

	/**
	 *Execute Add Product Action 
	 * 
	 * @param model {@link Model}
	 * @param request {@link HttpServletRequest}
	 * @return {@link String}
	 */
	@RequestMapping(value = "/themsanpham")
	public String themsanpham(Model model, HttpServletRequest request) {
		if (request.getParameter("action").equalsIgnoreCase("Insert")) {
			SanPham sp = (SanPham) CommonUtils.settingAttributeForObject(new SanPham(), request);
			sanphamDAO.saveObject(sp);
			return "redirect:/";
		}
		return "themsanpham";
	}
	
	/**
	 * Execute Edit Product Action
	 * 
	 * @param model {@link Model}
	 * @param request {@link HttpServletRequest}
	 * @return {@link String}
	 */
	@RequestMapping(value = "/suasanpham", method = RequestMethod.GET)
	public String suasanpham(Model model, HttpServletRequest request) {		
		int ma = Integer.parseInt(request.getParameter(SneakerGlobalConstant.OBJECT_ID));
		SanPham sp = sanphamDAO.getObj(ma);
		sp = (SanPham) CommonUtils.settingAttributeForObject(sp, request);
		sanphamDAO.updateObject(sp);
		return "redirect:/";
	}

	@RequestMapping("/search")
	public String search() {
		return "quanlysanpham";
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
	
	List<SanPham> editSession(SanPham sp,List<SanPham> lstSp){
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
}
