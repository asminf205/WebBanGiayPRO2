package poly.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import poly.bean.SanPham;
import poly.dao.generic.GenericDAO;

@Component("sanphamDAO")
@Transactional
public class SanPhamDAO extends GenericDAO<SanPham>{

	@Override
	public List<SanPham> getAll() {
		setClassType(SanPham.class);
		return super.getAll();
	}
	
	@Override
	public List<SanPham> filterSanPham(String query) {
		return super.filterSanPham(query);
	}
	
	
	
}
