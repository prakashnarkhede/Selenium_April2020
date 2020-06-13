package conceptStudy_Unused;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsConcepts2 {

	public static void main(String[] args) {
		
		//cntrl + shift + O --> remove unused imports

		List<String> l1 = new ArrayList<String>();
		l1.add("1001");
		l1.add("1002");
		l1.add("1001");
		l1.add("1010");
		
		System.out.println("List size is: "+l1.size());
		System.out.println("Actual List is: "+l1);
		
		System.out.println("3rd index data is: "+l1.get(3)); //1010
		
		
		//Collection<E> --> Interface
		//Collections  --> Utility class
		Collections.sort(l1);
		System.out.println("List after sorting: "+l1);
		
	}

}
