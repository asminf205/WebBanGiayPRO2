package poly.utils;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

import javax.servlet.Registration;
import javax.servlet.http.HttpServletRequest;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

import poly.bean.SanPham;
import poly.constants.SneakerGlobalConstant;

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
				if(objFields[i].getType().getName().equals("int")){
					objFields[i].set(obj, getFieldValueByType(requestParams.get(objFields[i].getName())));
				}else{
					objFields[i].set(obj, requestParams.get(objFields[i].getName())[0]);
				}
				
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
	
	public static String formatString(String[] array){
		if(array.length != 0){
			StringBuilder builder = new StringBuilder();
			for(int i = 0 ; i < array.length ; i++){
				builder.append(array[i]);
				builder.append(SneakerGlobalConstant.UNDERSCORE);
			}
			return builder.toString();
		}
		return "";
	}
	
	/**
	 * Send Mail
	 * @param mailSender
	 */
	public static void sendMail(MailSender mailSender) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("ben114111@gmail.com");
		message.setTo("namlehoang17497@gmail.com");
		message.setSubject("test");
		message.setText("message");
		mailSender.send(message);
	}
	
}
