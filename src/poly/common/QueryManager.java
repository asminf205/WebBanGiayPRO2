package poly.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import poly.constants.SneakerGlobalConstant;

public class QueryManager {

	private Map<String, String[]> properties;
	
	public QueryManager(Map<String,String[]> map){
		if(Objects.isNull(map)){
			properties = new HashMap<>();
		}
		setProperties(map);
	}
		
	public String generateCriteria(){
		StringBuilder builder = new StringBuilder();
		for (Map.Entry<String, String[]> entry : properties.entrySet()){
			builder.append(entry.getKey() +
					SneakerGlobalConstant.LIKE + 
					SneakerGlobalConstant.QUOTE + 
					entry.getValue()[0] + 
					SneakerGlobalConstant.QUOTE);			
			if(properties.size() > 1){
				builder.append(SneakerGlobalConstant.AND);
			}
		}		
		return builder.toString();
	}

	public Map<String, String[]> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, String[]> properties) {
		this.properties = properties;
	}
	
	
}
