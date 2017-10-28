package poly.controller;

import javax.servlet.http.HttpServletRequest;

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
			SanPham sp = (SanPham) CommonUtils.settingAttributeForObject(new SanPham(), request);
			sanphamDAO.saveObject(sp);
			return "redirect:/";
		}
		return "themsanpham";
	}

	@RequestMapping(value = "/suasanpham", method = RequestMethod.GET)
	public String suasanpham(Model model, HttpServletRequest request) {		
		request.getParameterMap().values().iterator().next();
		
		int ma = Integer.parseInt(request.getParameter("txtMa"));
		SanPham sp = sanphamDAO.getObj(ma);
		sp = (SanPham) CommonUtils.settingAttributeForObject(sp, request);
		sanphamDAO.updateObject(sp);
		return "redirect:/";
	}

	@RequestMapping("/search")
	public String search() {
		return "quanlysanpham";
	}
}
