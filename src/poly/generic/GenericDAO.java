package poly.generic;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import poly.bean.KhachHang;
import poly.bean.SanPham;
import poly.constants.SneakerGlobalConstant;

@Transactional
public class GenericDAO<T> implements IGenericDAO<T>{
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Class<T> classType;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void saveObject(T obj) {
		getSession().save(obj);
	}
	
	@Override
	public void updateObject(T obj) {
		getSession().update(obj);
	}

	@Override
	public void deleteObject(T obj) {
		getSession().delete(obj);
	}

	@Override
	public T getObj(int a) {
		return (T) getSession().get(classType, a);
	}

	@Override
	public List<T> getAll() {			
		return getSession().createQuery(SneakerGlobalConstant.FROM + classType.getSimpleName()).list();
	}

	public Class<T> getClassType() {
		return classType;
	}

	public void setClassType(Class<T> classType) {
		this.classType = classType;
	}	
	
	@Override
	public List<T> executeQuery(String query){
		return null;
	}
	@Override	
	public boolean checkLogin(String username, String password) {
		boolean success=false;
		List<KhachHang> user =  getSession().createQuery("from KhachHang").list();
		for(int i=0;i<user.size();i++){
			if(user.get(i).getUsername().equals(username) && user.get(i).getPassword().equals(password)){
				success=true;
			}
		}
		return success;
	}

}