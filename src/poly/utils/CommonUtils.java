package poly.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;

public class CommonUtils {

	public static Object settingAttributeForObject(Object obj, HttpServletRequest request){
		Iterator iter = request.getParameterMap().values().iterator();
		while(iter.hasNext()){
			Class objClass = obj.getClass();
			Method[] allMethods = objClass.getMethods();			
			Field[] allFields = objClass.getDeclaredFields();
		
			iter.next();
		}
		return "";
	}
}
