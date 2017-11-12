package poly.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "giay")
public class SanPham {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ma_giay")
	int ma;

	@Column(name = "tengiay")
	String ten;

	@Column(name = "gia")
	int gia;

	@Column(name = "hinh")
	String hinh;

	@Transient
	int soluong;

	@Column(name = "mau")
	String mau;

	@Column(name = "size")
	int size;

	@Column(name = "hang")
	String hangsx;
	
	@OneToMany(mappedBy="identity.sp")
	List<ChiTietHoaDon> listOrder = new ArrayList<ChiTietHoaDon>();

	public SanPham() {
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public String getHinh() {
		return hinh;
	}

	public void setHinh(String hinh) {
		this.hinh = hinh;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String getMau() {
		return mau;
	}

	public void setMau(String mau) {
		this.mau = mau;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getHangsx() {
		return hangsx;
	}

	public void setHangsx(String hangsx) {
		this.hangsx = hangsx;
	}

	public List<ChiTietHoaDon> getListOrder() {
		return listOrder;
	}

	public void setListOrder(List<ChiTietHoaDon> listOrder) {
		this.listOrder = listOrder;
	}

	public SanPham(String ten, int gia, String hinh, String mau, int size, String hangsx) {
		this.ten = ten;
		this.gia = gia;
		this.hinh = hinh;
		this.mau = mau;
		this.size = size;
		this.hangsx = hangsx;
	}

	public SanPham(int ma, String ten, int gia, String hinh, String mau, int size, String hangsx) {
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
		this.hinh = hinh;
		this.mau = mau;
		this.size = size;
		this.hangsx = hangsx;
	}

	public SanPham(String ten, int gia, String hinh, int soluong, String mau, int size, String hangsx) {
		this.ten = ten;
		this.gia = gia;
		this.hinh = hinh;
		this.soluong = soluong;
		this.mau = mau;
		this.size = size;
		this.hangsx = hangsx;
	}
}
