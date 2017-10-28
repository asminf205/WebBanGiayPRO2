package poly.utils;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

public class CommonUtils {

	static Logger logger = Logger.getLogger("commonUtils");

	private CommonUtils() {
		throw new IllegalStateException("Utility class");
	}

	/**
	 * this method used for setting properties from client request for obj
	 * 
	 * @param obj
	 *            {@link Object}
	 * @param request
	 *            {@link HttpServletRequest}
	 * @return obj {@link Object}
	 */
	public static Object settingAttributeForObject(Object obj, HttpServletRequest request) {
		Map<String, String[]> requestParams = request.getParameterMap();
		Field[] objFields = getObjFields(obj);		
		for (int i = 0; i < objFields.length; i++) {
			objFields[i].setAccessible(true);
			try {
				if(Objects.isNull(requestParams.get(objFields[i].getName()))){
					continue;
				}
				objFields[i].set(obj, getFieldValueByType(requestParams.get(objFields[i].getName())));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				logger.info(e.getMessage());
			}
		}
		return obj;
	}

	/**
	 * this method is used for getting field value by its type
	 * 
	 * @param obj
	 *            {@link String[]}
	 * @return {@link Object}
	 */
	private static Object getFieldValueByType(String[] obj) {		
		if (checkInteger(obj[0])) {
			return new Integer(obj[0]);
		}
		return obj[0];
	}

	/**
	 * 
	 * @param str
	 *            {@link String}
	 * @return {@link boolean}
	 */
	private static boolean checkInteger(String str) {
		try {
			new Integer(str);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static Field[] getObjFields(Object obj) {
		return obj.getClass().getDeclaredFields();
	}
}
