package poly.dao.generic;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class GenericDAO<T> implements IGenericDAO{
	
	SessionFactory sessionFactory;
	
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
		return sessionFactory.getCurrentSession();
	}
	
	public abstract T getObject();
	
	public abstract void saveObject(T obj);
	
	public abstract void deleteObject(T obj);
	
	public abstract List<T> getObjectList();
	
	public abstract void updateObject(T obj);
		
}