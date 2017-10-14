package poly.dao.generic;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public interface IGenericDAO {

	 SessionFactory getSessionFactory();
	
	 Session getSession();
	
	
}
