package poly.dao.generic;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import poly.dao.QueryUtils;


public class GenericDAO<T> implements IGenericDAO<T>{
	
	SessionFactory sessionFactory;
	
	private Class<T> classType;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public Session getSession() {
		return sessionFactory.openSession();
	}

	@Override
	public void saveOrUpdateObject(T obj) {
		getSession().saveOrUpdate(obj);
	}

	@Override
	public void deleteObject(T obj) {
		getSession().delete(obj);
	}

	@Override
	public T getObj(int a) {
		return null;
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