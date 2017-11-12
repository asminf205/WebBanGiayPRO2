package poly.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="khachhang")
public class KhachHang {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ma_khachhang")
	int ma;
	
	@Column(name="username")
	String username;
	
	@Column(name="password")
	String password;
	
	@Column(name="hoten")
	String hoten;
	
	@Column(name="sdt")
	String sdt;
	
	@Column(name="diachi")
	String diachi;
	
	@Column(name="email")
	String email;
	
	public KhachHang() {		
	}



	public int getMa() {
		return ma;
	}


	public void setMa(int ma) {
		this.ma = ma;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public KhachHang(int ma, String username, String password, String hoten, String sdt, String diachi,
			String email) {
		this.ma = ma;
		this.username = username;
		this.password = password;
		this.hoten = hoten;
		this.sdt = sdt;
		this.diachi = diachi;
		this.email = email;
	}

}
