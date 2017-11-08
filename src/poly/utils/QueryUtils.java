package poly.utils;

import poly.common.QueryManager;
import poly.constants.SneakerGlobalConstant;

public class QueryUtils {

	public static String createQueryWithCrit(Object obj,QueryManager queryManager){
		if(queryManager.generateCriteria().equals("")){
			return SneakerGlobalConstant.FROM + obj.getClass().getSimpleName();
		}
		return SneakerGlobalConstant.FROM + obj.getClass().getSimpleName()+ SneakerGlobalConstant.WHERE + queryManager.generateCriteria();
	}
	
}
