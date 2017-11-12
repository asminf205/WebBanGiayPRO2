
package poly.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import poly.bean.KhachHang;
import poly.generic.GenericDAO;

@Component("khachhangDAO")
@Transactional
public class KhachHangDAO extends GenericDAO<KhachHang>{

	@Override
	public List<KhachHang> getAll() {
		setClassType(KhachHang.class);
		return super.getAll();
	}	

}