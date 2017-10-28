package poly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import poly.bean.SanPham;
import poly.dao.generic.IGenericDAO;

@Controller
public class CommonController {
	@Autowired
	IGenericDAO<SanPham> sanphamDAO;


	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String showIndex(Model model){
		model.addAttribute("list", sanphamDAO.getAll());
		return "index";
	}
}
