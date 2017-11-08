package poly.dao;

import org.springframework.stereotype.Component;

import poly.bean.ChiTietHoaDon;
import poly.dao.generic.GenericDAO;

@Component("hoadonDAO")
public class HoaDonDAO extends GenericDAO<ChiTietHoaDon> {

	@Override
	public void saveObject(ChiTietHoaDon obj) {
		
		super.saveObject(obj);
	}
}
