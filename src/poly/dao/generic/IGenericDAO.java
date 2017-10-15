package poly.dao.generic;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface IGenericDAO<T> {

	 SessionFactory getSessionFactory();
	
	 Session getSession();
	 
	 void saveOrUpdateObject(T obj);
	 
	 void deleteObject(T obj);
	 
	 T getObj(int a);
	 
	 List<T> getAll();
		 
	
	
}