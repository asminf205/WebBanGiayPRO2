package poly.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import poly.bean.SanPham;
import poly.dao.generic.IGenericDAO;
import poly.utils.CommonUtils;

@Controller
public class SanPhamController {

	@Autowired
	IGenericDAO<SanPham> sanphamDAO;

	/**
	 * Show All Product
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String laysanpham(Model model, HttpServletRequest request) {
		model.addAttribute("list", sanphamDAO.getAll());
		return "quanlysanpham";
	}

	@RequestMapping(value = "/edit")
	public String editSP(HttpServletRequest request, Model model) {
		int ma = Integer.parseInt(request.getParameter("ma"));
		SanPham sp = sanphamDAO.getObj(ma);
		request.setAttribute("SP", sp);
		return "editproduct";
	}

	@RequestMapping(value = "/themsanpham")
	public String themsanpham(Model model, HttpServletRequest request) {
		if (request.getParameter("action").equalsIgnoreCase("Insert")) {
			String ten = request.getParameter("txtTen");
			int gia = Integer.parseInt(request.getParameter("txtGia"));
			String hinh = request.getParameter("txtHinh");
			String mau = request.getParameter("txtMau");
			String cogiay = request.getParameter("txtSize");
			int size = Integer.parseInt(cogiay);
			String hangsx = request.getParameter("txtHang");
			sanphamDAO.saveObject(new SanPham(ten, gia, hinh, mau, size, hangsx));
			return "redirect:/";
		}
		return "themsanpham";
	}

	@RequestMapping(value = "/suasanpham", method = RequestMethod.GET)
	public String suasanpham(Model model, HttpServletRequest request) {		
		request.getParameterMap().values().iterator().next();
		
		int ma = Integer.parseInt(request.getParameter("txtMa"));
		SanPham sp = sanphamDAO.getObj(ma);
		CommonUtils.settingAttributeForObject(sp, request);
		sp.setTen(request.getParameter("txtTen"));
		sp.setGia(Integer.parseInt(request.getParameter("txtGia")));
		sp.setHinh(request.getParameter("txtHinh"));
		sp.setMau(request.getParameter("txtMau"));
		String cogiay = request.getParameter("txtSize");
		sp.setSize(Integer.parseInt(cogiay));
		sp.setHangsx(request.getParameter("txtHang"));
		sanphamDAO.updateObject(sp);;
		return "redirect:/";
	}

	@RequestMapping("/search")
	public String search() {
		return "quanlysanpham";
	}
	
	@RequestMapping(value = "/cart")
	public String cart(HttpServletRequest request, Model model,HttpSession session) {
		List<SanPham> list = null;
		
		int ma = Integer.parseInt(request.getParameter("ma"));
		SanPham sp = sanphamDAO.getObj(ma);
		
		if(java.util.Objects.isNull(session)){
			session=request.getSession();
		}
		if(java.util.Objects.isNull(session.getAttribute("listCart"))){
			list=editSession(sp,new ArrayList<>());
		}else{
			list=editSession(sp, (List<SanPham>)session.getAttribute("listCart"));
		}
		
		
		session.setAttribute("listCart", list);
		return "Cart";
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("listSP2", sanphamDAO.getAll());
		return "index";
	}
	
	List<SanPham> editSession(SanPham sp,List<SanPham> lstSp){
		for(int i=0;i<lstSp.size();i++){
			if(lstSp.get(i).getMa()==sp.getMa()){
				lstSp.get(i).setSoluong(lstSp.get(i).getSoluong()+1);
				
				return lstSp;
			}
		}
		sp.setSoluong(1);
		lstSp.add(sp);
		return lstSp;
	}
}
