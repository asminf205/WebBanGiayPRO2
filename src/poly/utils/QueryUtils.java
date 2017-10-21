package poly.utils;

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
	public static String filterQuery(String className, String ten, String mau, String hang, int size){
		String query = FROM + className + WHERE +"ten like '"+ten+"'"+ AND +"mau like '"+mau+"'"+ AND +"hang like '"+hang+"'";				
		if(size != -1){
			query += "size = "+size;
		}
		return query;
	}
		
}
