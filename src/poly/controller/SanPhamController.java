package poly.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import poly.bean.SanPham;

import poly.model.SanPhamModel;

@Controller
public class SanPhamController {
	@Autowired
	ServletContext context;

	@RequestMapping("/quanlysanpham")
	public String qlsanpham(HttpServletRequest request, ModelMap model) {
		try {
			if (request.getParameter("action").equalsIgnoreCase("Search")) {
				String tensp = request.getParameter("txtTenSP");
				SanPhamModel sp = new SanPhamModel();
				List<SanPham> list = new ArrayList<SanPham>();
				list = sp.searchProduct(tensp);
				request.setAttribute("listSP", list);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "quanlysanpham";
	}

	@RequestMapping("newProduct")
	public String themSanPham(HttpServletRequest request, ModelMap model
			) {
		try {

			if (request.getParameter("action").equalsIgnoreCase("Insert")) {						
				String ten = request.getParameter("txtTen");
				String gia = request.getParameter("txtGia");
				int pri = Integer.parseInt(gia);
				String hinh = request.getParameter("txtHinh");
				String soluonga = request.getParameter("txtSoluong");
				int soluong = Integer.parseInt(soluonga);
				String mau = request.getParameter("txtMau");
				String cogiay = request.getParameter("txtSize");
				int size = Integer.parseInt(cogiay);
				String hangsx = request.getParameter("txtHang");
				SanPhamModel sp = new SanPhamModel();
				sp.insert(ten, pri, hinh, soluong, mau, size, hangsx);
				return "redirect:/index.htm";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "themsanpham";
	}

	@RequestMapping("/index")
	public String showsanpham(HttpServletRequest request, ModelMap model) {
		try {
			SanPhamModel sp = new SanPhamModel();
			List<SanPham> list = new ArrayList<SanPham>();
			list = sp.showAllProduct();
			request.setAttribute("listSP2", list);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
}
