package poly.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import poly.bean.SanPham;
import poly.dao.SanPhamDAO;
import poly.dao.generic.IGenericDAO;
import poly.utils.QueryUtils;

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
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String laysanpham(Model model,HttpServletRequest request){
		model.addAttribute("list", sanphamDAO.getAll());
		return "quanlysanpham";
	}
	
	@RequestMapping(value = "/edit")
	public String editSP(HttpServletRequest request, Model model){
		int ma= Integer.parseInt(request.getParameter("ma"));
		SanPham sp = sanphamDAO.getObj(ma);
        request.setAttribute("SP", sp);
        return "editproduct";
	}
	
	@RequestMapping(value="/themsanpham")
		public String themsanpham(Model model,HttpServletRequest request){
		try {
			
			if (request.getParameter("action").equalsIgnoreCase("Insert")) {						
				String ten = request.getParameter("txtTen");
				int gia = Integer.parseInt(request.getParameter("txtGia"));
				String hinh = request.getParameter("txtHinh");
				String soluonga = request.getParameter("txtSoluong");
				int soluong = Integer.parseInt(soluonga);
				String mau = request.getParameter("txtMau");
				String cogiay = request.getParameter("txtSize");
				int size = Integer.parseInt(cogiay);
				String hangsx = request.getParameter("txtHang");
				sanphamDAO.saveObject(new SanPham( ten, gia, hinh, soluong,mau,size, hangsx));						
				return "redirect:/";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return "themsanpham";
	}
	@RequestMapping(value="/suasanpham", method=RequestMethod.GET)
	public String suasanpham(Model model,HttpServletRequest request){
			int ma= Integer.parseInt(request.getParameter("txtMa"));
			SanPham sp = sanphamDAO.getObj(ma);
			sp.setTen(request.getParameter("txtTen"));
			sp.setGia(Integer.parseInt(request.getParameter("txtGia")));
			sp.setHinh("abc");
			String soluonga = request.getParameter("txtSoluong");
			sp.setSoluong(Integer.parseInt(soluonga));
			sp.setMau(request.getParameter("txtMau"));
			String cogiay = request.getParameter("txtSize");
			sp.setSize(Integer.parseInt(cogiay));
			sp.setHangsx(request.getParameter("txtHang"));			
			sanphamDAO.updateObject(sp);						
			return "redirect:/";
}
	@RequestMapping("/search")
	public String search(){
		return "quanlysanpham";
	}
}
