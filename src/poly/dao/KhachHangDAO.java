
package poly.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import poly.bean.KhachHang;
import poly.bean.SanPham;
import poly.generic.GenericDAO;

@Component("khachhangDAO")
@Transactional
public class KhachHangDAO extends GenericDAO<KhachHang>{

	@Override
	public List<KhachHang> getAll() {
		setClassType(KhachHang.class);
		return super.getAll();
	}	
	public List<KhachHang> searchLikeName(String nameSearch) {
	       try{
	           Class.forName("com.mysql.jdbc.Driver");
	           String url="jdbc:mysql://localhost:3306/duan2";
	           Connection con = DriverManager.getConnection(url, "root", "");
	           String sql = "select * from khachhang where username like ?";
	           PreparedStatement stm = con.prepareStatement(sql);
	           stm.setString(1, "%"+nameSearch+"%");
	           ResultSet rs = stm.executeQuery();
	           List<KhachHang> result = new ArrayList<KhachHang>();
	           while(rs.next()){
	               int ma = rs.getInt("ma_khachhang");
	               String username = rs.getString("username");
	               String password = rs.getString("password");
	               String hoten = rs.getString("hoten");
	               String sdt = rs.getString("sdt");
	               String diachi = rs.getString("diachi");
	               String email = rs.getString("email");
	               KhachHang acc = new KhachHang(ma, username, password, hoten, sdt, diachi, email);
	               result.add(acc);
	           }
	           return result;
	       }catch(Exception e){
	           e.printStackTrace();
	       }
	       return null;
	   }
}