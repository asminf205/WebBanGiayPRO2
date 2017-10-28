package poly.utils;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

public class CommonUtils {
	
	static Logger logger = Logger.getLogger("commonUtils");
	
	private CommonUtils(){
		throw new IllegalStateException("Utility class");
	}

	public static Object settingAttributeForObject(Object obj, HttpServletRequest request){
		Iterator<String[]> iter = request.getParameterMap().values().iterator();
		Class<?> objClass = obj.getClass();		
		Field[] objFields = objClass.getDeclaredFields();
		int i = 0;
		while (iter.hasNext()){
			objFields[i].setAccessible(true);
			try {
				objFields[i].set(obj,getFieldValueByType(iter.next()));
				i+=1;
			} catch (IllegalArgumentException e) {
				logger.info(e.getMessage());				
			} catch (IllegalAccessException e) {
				logger.info(e.getMessage());
			}
		}
		return "";
	}
	
	private static Object getFieldValueByType(String[] obj){		
		if(checkInteger(obj[0])){
			return new Integer(obj[0]);
		}
		return obj[0];
	}
	
	private static boolean checkInteger(String str){
		try{new Integer(str); return true;}catch(Exception e){
			return false;
		}
	}
}
