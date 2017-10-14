package poly.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import poly.bean.SanPham;

@Component
@Transactional
public class SanPhamDAO {

	@Autowired
	SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public List<SanPham> layTatCaSanPham(){
		return getSession().createQuery("from SanPham").list();
	}
	
	public void luuHoacCapNhat(SanPham sp){
		getSession().saveOrUpdate(sp);
	}
	
	public void xoaSanPham(SanPham sp){
		getSession().delete(sp);
	}
	
	public SanPham laySanPhamBangMa(int ma){
		return (SanPham)getSession().get(SanPham.class, ma);
	}
	
}
