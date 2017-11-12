package poly.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import poly.bean.KhachHang;
import poly.common.QueryManager;
import poly.constants.SneakerGlobalConstant;
import poly.generic.IGenericDAO;
import poly.utils.QueryUtils;

@Controller
public class KhachHangController {


		@Autowired
		IGenericDAO<KhachHang> khachhangDAO;

		/**
		 * Show Customer List
		 * @param model {@link Model}
		 * @param request {@link HttpServletRequest}
		 * @return {@link String}
		 */
		@RequestMapping(value = "/quanlykhachhang", method = RequestMethod.GET)
		public String laykhachhang(Model model, HttpServletRequest request) {
			model.addAttribute("listKH", khachhangDAO.getAll());
			return SneakerGlobalConstant.QUAN_LY_KHACH_HANG_PAGE;
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
			int ma = Integer.parseInt(request.getParameter(SneakerGlobalConstant.OBJECT_ID));
			KhachHang kh = khachhangDAO.getObj(ma);
			request.setAttribute("kh", kh);
			return SneakerGlobalConstant.SUA_KHACH_HANG_PAGE;
		}

		/**
		 *Execute Add Customer Action 
		 * 
		 * @param model {@link Model}
		 * @param request {@link HttpServletRequest}
		 * @return {@link String}
		 */
		@RequestMapping(value = "/khachhang/moi", method=RequestMethod.POST)
		public String themKH(Model model, HttpServletRequest request, KhachHang kh) {
				khachhangDAO.saveObject(kh);
				return "redirect:/";
		}
		
		@RequestMapping(value="/themkhachhang")
		public String hienthitrang(){
			return SneakerGlobalConstant.THEM_KHACH_HANG_PAGE;
		}
		
		/**
		 * Execute Edit Customer Action
		 * 
		 * @param model {@link Model}
		 * @param request {@link HttpServletRequest}
		 * @return {@link String}
		 */
		@RequestMapping(value = "/suakhachhang", method = RequestMethod.GET)
		public String suaKH(Model model, HttpServletRequest request, KhachHang kh) {		
			int ma = Integer.parseInt(request.getParameter(SneakerGlobalConstant.OBJECT_ID));
			kh.setMa(ma);
			khachhangDAO.updateObject(kh);
			return "redirect:/";
		}

		/**
		 * Search Customer Action
		 * @param request {@link HttpServletRequest}
		 * @param model {@link Model}
		 * @return {@link String}
		 */
		@RequestMapping("/searchkh")
		public String searchKH(HttpServletRequest request,Model model) {
			model.addAttribute("list", khachhangDAO.executeQuery(QueryUtils.createQueryWithCrit(new KhachHang(),new QueryManager(request.getParameterMap())) ) );
			return SneakerGlobalConstant.QUAN_LY_KHACH_HANG_PAGE;
		}
		
		/**
		 * Execute Delete Action
		 * @param model {@link Model}
		 * @param request {@link HttpServletRequest}
		 * @return {@link String}
		 */
		@RequestMapping(value = "/deleteKH")
		public String xoakhachhang(Model model, HttpServletRequest request) {
				int makh = Integer.parseInt(request.getParameter(SneakerGlobalConstant.OBJECT_ID));
				KhachHang kh = khachhangDAO.getObj(makh);
				khachhangDAO.deleteObject(kh);
			return SneakerGlobalConstant.QUAN_LY_KHACH_HANG_PAGE;
		}

		@RequestMapping(value="/addUser")
		public String hienthitrangAddUser(){
			return SneakerGlobalConstant.REGISTER;
		}
		
		@RequestMapping(value="/signup")
		public String hienthitrangSignup(){
			return SneakerGlobalConstant.SIGNUP;
		}
		
		@RequestMapping(value = "/login")
		public String login(Model model, HttpServletRequest request){
				String user=request.getParameter("username");
				String pass=request.getParameter("password");
				if(khachhangDAO.checkLogin(user, pass)){					
			return "redirect:/";
				}
				return SneakerGlobalConstant.SIGNUP;
				
		}
}

