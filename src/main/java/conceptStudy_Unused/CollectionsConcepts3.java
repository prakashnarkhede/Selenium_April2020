package conceptStudy_Unused;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CollectionsConcepts3 {

	public static void main(String[] args) {

		Map<String, String> testData = new HashMap<String, String>();
		//stores data in Key - value
		
		testData.put("Vehicle_Make", "Honda");
		testData.put("Vehicle_Model", "Motorcycle");
		testData.put("Vehicle_CylinderCapacity", "333");
		testData.put("Vehicle_Enging Performance", "666");
		
		System.out.println("Map data is: "+testData);
		System.out.println("Size of testdata is: "+testData.size());
		
		System.out.println("Vehicle_Make is present? "+testData.containsKey("Vehicle_Make"));
		System.out.println("Vehicle_Make is: "+testData.get("Vehicle_Make"));
		
		//Collections.synchronizedMap(testData);
		
	}

}
