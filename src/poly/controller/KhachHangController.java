package poly.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import poly.bean.KhachHang;
import poly.constants.SneakerGlobalConstant;
import poly.dao.generic.IGenericDAO;
import poly.utils.CommonUtils;

@Controller
public class KhachHangController {


		@Autowired
		IGenericDAO<KhachHang> khachhangDAO;

		/**
		 * Show All Product
		 * 
		 * @param model {@link Model}
		 * @param request {@link HttpServletRequest}
		 * @return {@link String}
		 */
		@RequestMapping(value = "/quanlykhachhang", method = RequestMethod.GET)
		public String laykhachhang(Model model, HttpServletRequest request) {
			model.addAttribute("listKH", khachhangDAO.getAll());
			return "quanlykhachhang";
		}

		/**
		 * show edit page for admin
		 * 
		 * @param request {@link HttpServletRequest}
		 * @param model {@link Model}
		 * @return {@link String}
		 */
		@RequestMapping(value = "/editKH")
		public String editKH(HttpServletRequest request, Model model) {
			int ma = Integer.parseInt(request.getParameter("txtMakh"));
			KhachHang kh = khachhangDAO.getObj(ma);
			request.setAttribute("kh", kh);
			return "editCustomer";
		}

		/**
		 *Execute Add Product Action 
		 * 
		 * @param model {@link Model}
		 * @param request {@link HttpServletRequest}
		 * @return {@link String}
		 */
		@RequestMapping(value = "/themkhachhang")
		public String themKH(Model model, HttpServletRequest request) {
			if (request.getParameter("action").equalsIgnoreCase("Add")) {
				KhachHang kh = (KhachHang) CommonUtils.settingAttributeForObject(new KhachHang(), request);
				khachhangDAO.saveObject(kh);
				return "index";
			}
			return "themkhachhang";
		}
		
		/**
		 * Execute Edit Product Action
		 * 
		 * @param model {@link Model}
		 * @param request {@link HttpServletRequest}
		 * @return {@link String}
		 */
		@RequestMapping(value = "/suakhachhang", method = RequestMethod.GET)
		public String suaKH(Model model, HttpServletRequest request) {		
			int ma = Integer.parseInt(request.getParameter(SneakerGlobalConstant.OBJECT_ID));
			KhachHang kh = khachhangDAO.getObj(ma);
			kh = (KhachHang) CommonUtils.settingAttributeForObject(kh, request);
			khachhangDAO.updateObject(kh);
			return "redirect:/";
		}

		@RequestMapping("/searchkh")
		public String searchKH() {
			return "quanlykhachhang";
		}
		
		@RequestMapping(value = "/deleteKH")
		public String xoakhachhang(Model model, HttpServletRequest request) {
				int makh = Integer.parseInt(request.getParameter(SneakerGlobalConstant.OBJECT_ID));
				KhachHang kh = khachhangDAO.getObj(makh);
				khachhangDAO.deleteObject(kh);
			return "quanlykhachhang";
		}
	
	}

