package poly.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import poly.bean.ChiTietHoaDon;
import poly.bean.HoaDon;
import poly.bean.KhachHang;
import poly.bean.SanPham;
import poly.constants.SneakerGlobalConstant;
import poly.dao.generic.IGenericDAO;

@Controller
public class CommonController {
	@Autowired
	IGenericDAO<SanPham> sanphamDAO;
	
	@Autowired
	IGenericDAO<HoaDon> hoadonDAO;


	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String showIndex(Model model){
		model.addAttribute("list", sanphamDAO.getAll());
		return SneakerGlobalConstant.INDEX_PAGE;
	}
	
	@RequestMapping(value="/hoadon/moi", method=RequestMethod.POST)
	public String saveHoaDon(Model model, HttpSession session, KhachHang kh){
		List<SanPham> carts = (List<SanPham>) session.getAttribute("listCart");
		for(int i=0 ; i < carts.size(); i ++){
			 HoaDon hd = new HoaDon();
			 hd.setNgaytao(new Date());
			 hd.setKhachhang(kh);

			 SanPham sp = sanphamDAO.getObj(carts.get(i).getMa());
			 
			 ChiTietHoaDon cthd = new ChiTietHoaDon();
			 cthd.setSp(sp);
			 cthd.setHoadon(hd);
			 cthd.setSoluong(carts.get(i).getSoluong());

			 hoadonDAO.saveObject(hd);
		}
			
		return "";
	}
}
