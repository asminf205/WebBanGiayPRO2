package poly.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import poly.bean.SanPham;
import poly.generic.GenericDAO;

@Component("sanphamDAO")
@Transactional
public class SanPhamDAO extends GenericDAO<SanPham>{

	@Override
	public List<SanPham> getAll() {
		setClassType(SanPham.class);
		return super.getAll();
	}	
	
	public List<SanPham> searchLikeName(String nameSearch) {
	       try{
	           Class.forName("com.mysql.jdbc.Driver");
	           String url="jdbc:mysql://localhost:3306/duan2";
	           Connection con = DriverManager.getConnection(url, "root", "");
	           String sql = "select * from giay where tengiay like ?";
	           PreparedStatement stm = con.prepareStatement(sql);
	           stm.setString(1, "%"+nameSearch+"%");
	           ResultSet rs = stm.executeQuery();
	           List<SanPham> result = new ArrayList<SanPham>();
	           while(rs.next()){
	               int ma = rs.getInt("ma_giay");
	               String ten = rs.getString("tengiay");
	               int gia = rs.getInt("gia");
	               String hinh = rs.getString("hinh");
	               String mau = rs.getString("mau");
	               int size = rs.getInt("size");
	               String hangsx = rs.getString("hang");
	               SanPham acc = new SanPham(ma, ten, gia, hinh, mau, size, hangsx);
	               result.add(acc);
	           }
	           return result;
	       }catch(Exception e){
	           e.printStackTrace();
	       }
	       return null;
	   }
}
