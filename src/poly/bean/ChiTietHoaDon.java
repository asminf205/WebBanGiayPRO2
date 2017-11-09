package poly.bean;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@AssociationOverrides({
	@AssociationOverride(joinColumns = @JoinColumn(name="ma_hoadon"),name="identity.hoadon"),
	@AssociationOverride(joinColumns = @JoinColumn(name="ma_giay"),name="identity.sp"),
})
@Entity
@Table(name="chitiethoadon")
public class ChiTietHoaDon {

	@EmbeddedId
	ChiTietHoaDon_Identity identity = new ChiTietHoaDon_Identity();
	
	@Column(name="soluong")
	int soluong;
	
	public ChiTietHoaDon(){}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	
	public HoaDon getHoadon() {
		return identity.getHoadon();
	}

	public void setHoadon(HoaDon hoadon) {
		this.identity.hoadon = hoadon;
	}

	public SanPham getSp() {
		return identity.getSp();
	}

	public void setSp(SanPham sp) {
		this.identity.sp = sp;
	}
}
