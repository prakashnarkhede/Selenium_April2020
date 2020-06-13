package conceptStudy_Unused;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class CollectionsConcepts {

	public static void main(String[] args) {
		

		Set<String> s = new HashSet<String>();
		s.add("1001");
		s.add("2001");
		s.add("1002");
		s.add("1001");
		
		System.out.println("Size of set is: "+s.size());
		System.out.println("Set data is: "+s);
		
		
		//retrive data from set
		for (String str : s) {
			System.out.println("Set data is: "+str);
		}
		
		Set<String> s1 = new HashSet<String>();
		s1.add("1001");
		s1.add("2002");
		s1.add("1003");
		s1.add("1009");
		
		s.addAll(s1);
		System.out.println("Set new data: "+s);
		
		System.out.println("does set contain 1001? "+s.contains("10011"));
		
		s.remove("1001");
		
		System.out.println("set data after removal of 1001: "+s);
		
		s.clear();
		
		System.out.println("Set data after clearing: "+s);
		
		//port 1001, 2002, 1001, 
		
	}

}
