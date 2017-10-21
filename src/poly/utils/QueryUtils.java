package poly.utils;

import org.hibernate.Query;

import com.mysql.jdbc.StringUtils;

public class QueryUtils {

	/* HQL query */
	
	public static final String FROM = "from ";
	
	public static final String WHERE = "where ";
	
	public static final String AND = " and ";
	
	/**
	 * This method used for filtering product with multi condition
	 * 
	 * @param className {@link String}
	 * @param ten {@link String}
	 * @param mau {@link String}
	 * @param hang {@link String}
	 * @param size {@link Integer}
	 * @return query {@link String}
	 */
	public static String filterQuery(Class classType, Object object){		
		return "";		
	}
}
