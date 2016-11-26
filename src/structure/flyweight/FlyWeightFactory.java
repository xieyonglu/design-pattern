package structure.flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

public class FlyWeightFactory {

	private static Map<String, FlyWeight> flyWeightMap = new LinkedHashMap<>();
	
	public static FlyWeight getFlyWeight(String key) {
		if(flyWeightMap.get(key) == null) {
			flyWeightMap.put(key, new FlyWeight());
		}
		
		return flyWeightMap.get(key);
	}
	
}
