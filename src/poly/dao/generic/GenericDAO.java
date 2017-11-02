package poly.dao.generic;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import poly.bean.SanPham;
import poly.utils.QueryUtils;

@Transactional
public class GenericDAO<T> implements IGenericDAO<T>{
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Class<T> classType;
	public List<T> filterSanPham(String query){
		CriteriaBuilder builder = getSession().getCriteriaBuilder();
		CriteriaQuery<SanPham> criteria = builder.createQuery( SanPham.class );
		Root<SanPham> personRoot = criteria.from( SanPham.class );
		criteria.select( personRoot );
		criteria.where( builder.equal( personRoot.get( personRoot.get("mau") ), "brown" ) );
		return getSession().createQuery(query).list();
	}
	
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
		return getSession().createQuery(QueryUtils.FROM + classType.getSimpleName()).list();
	}

	public Class<T> getClassType() {
		return classType;
	}

	public void setClassType(Class<T> classType) {
		this.classType = classType;
	}	
	

}