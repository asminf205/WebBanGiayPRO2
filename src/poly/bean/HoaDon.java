package poly.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="hoadon")
public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ma_hoadon")
	int mahoadon;
	
	@Column(name="ngaytao")
	@Temporal(TemporalType.DATE)
	Date ngaytao;
		
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

	public Date getNgaytao() {
		return ngaytao;
	}


	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}


	public KhachHang getKhachhang() {
		return khachhang;
	}


	public void setKhachhang(KhachHang khachhang) {
		this.khachhang = khachhang;
	}
	
}
