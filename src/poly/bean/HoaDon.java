package poly.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hoadon")
public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ma_hoadon")
	int mahoadon;
	
	@Column(name="ngaytao")
	String ngaytao;
	
	@Column(name="password")
	String password;
	
	
	
	
	public HoaDon() {		
	}
}
