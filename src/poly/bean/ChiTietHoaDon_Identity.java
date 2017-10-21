package poly.bean;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ChiTietHoaDon_Identity {

	@ManyToOne
	public HoaDon hoadon;
	
	@ManyToOne
	public SanPham sp;

	public HoaDon getHoadon() {
		return hoadon;
	}

	public void setHoadon(HoaDon hoadon) {
		this.hoadon = hoadon;
	}

	public SanPham getSp() {
		return sp;
	}

	public void setSp(SanPham sp) {
		this.sp = sp;
	}
	
	
}
