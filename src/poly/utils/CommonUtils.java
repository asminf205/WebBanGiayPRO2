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
		Iterator<?> iter = request.getParameterMap().values().iterator();
		while(iter.hasNext()){
			Class<?> objClass = obj.getClass();
			Field[] objFields = objClass.getDeclaredFields();
			try {
				objFields[0].set(obj, iter.next());
			} catch (IllegalArgumentException | IllegalAccessException e) {
				logger.info("Illegal Exception");
			}
		}
		return "";
	}
}
