package poly.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "makh")
	KhachHang khachhang;
	
	
	public HoaDon() {		
	}


	public int getMahoadon() {
		return mahoadon;
	}


	public void setMahoadon(int mahoadon) {
		this.mahoadon = mahoadon;
	}


	public String getNgaytao() {
		return ngaytao;
	}


	public void setNgaytao(String ngaytao) {
		this.ngaytao = ngaytao;
	}


	public KhachHang getKhachhang() {
		return khachhang;
	}


	public void setKhachhang(KhachHang khachhang) {
		this.khachhang = khachhang;
	}
	
}
