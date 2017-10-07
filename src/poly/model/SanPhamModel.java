package poly.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;


import poly.bean.SanPham;

public class SanPhamModel {
	public SanPhamModel() {
		super();
	}
    public List<SanPham> searchProduct(String tensp) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=PRO2";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = " Select * from giay ";
            if (tensp.length() > 0) {
                sql += " where tengiay like '%" + tensp + "%'";
            }
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<SanPham> list = new ArrayList<SanPham>();
            while (rs.next()) {
                int ma = rs.getInt("ma_giay");
                String ten = rs.getString("tengiay");
                int gia = rs.getInt("gia");
                String hinh = rs.getString("hinh"); 
                int soluong = rs.getInt("soluong");
                String mau = rs.getString("mau");
                int size = rs.getInt("size");
                String hang = rs.getString("hang"); 
                SanPham sp = new SanPham(ma, ten, gia, hinh, soluong, mau, size, hang);
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<SanPham> showAllProduct() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=PRO2";
            Connection con = DriverManager.getConnection(url, "sa", "123");
           String sql = "Select * from giay";        
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<SanPham> list = new ArrayList<SanPham>();
            while (rs.next()) {
                int ma = rs.getInt("ma_giay");
                String ten = rs.getString("tengiay");
                int gia = rs.getInt("gia");
                String hinh = rs.getString("hinh"); 
                int soluong = rs.getInt("soluong");
                String mau = rs.getString("mau");
                int size = rs.getInt("size");
                String hang = rs.getString("hang"); 
                SanPham sp = new SanPham(ma, ten, gia, hinh, soluong, mau, size, hang);
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void insert(String tensp, int pri,String hinh,int soluong,String mau,int size,String hangsx) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=PRO2";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "insert into giay values (?,?,?,?,?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, tensp);
            stm.setInt(2, pri);
            stm.setString(3, hinh);
            stm.setInt(4,soluong);
            stm.setString(5, mau);
            stm.setInt(6,size);
            stm.setString(7, hangsx);
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
