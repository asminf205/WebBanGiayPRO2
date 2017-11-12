package poly.constants;

public class SneakerGlobalConstant {
	
	private SneakerGlobalConstant(){
		throw new IllegalStateException("Constant Class");
	}
	/* Common Constant */
	public static final String SPACE = " " ;
	public static final String UNDERSCORE = "_" ;
	
	/* Common Object Constants */
	public static final String OBJECT_ID = "ma";
	public static final String OBJECT_NAME = "ten";
	
	/* HQL query */
	
	public static final String FROM = "from ";
	public static final String WHERE = " where ";
	public static final String AND = " and ";
	public static final String LIKE = " like ";
	public static final String QUOTE="'";	
	
	/* Page Name */
	public static final String INDEX_PAGE = "index";
	public static final String QUAN_LY_KHACH_HANG_PAGE = "quanlykhachhang";
	public static final String THEM_KHACH_HANG_PAGE = "themkhachhang";
	public static final String SUA_KHACH_HANG_PAGE = "editCustomer";
	
	public static final String QUAN_LY_SAN_PHAM_PAGE = "quanlysanpham";
	public static final String SUA_SAN_PHAM_PAGE = "editproduct";
	public static final String THEM_SAN_PHAM_PAGE = "themsanpham";
	
	public static final String REGISTER = "AddUser";
	public static final String SIGNUP = "signup";
	public static final String ADD_USER_ORDER = "AddUserOrder";
	public static final String ORDER_SUCCESS = "SuccessOrder";
	
}
