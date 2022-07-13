package collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetstudy_2 {

	public static void main(String[] args) {

		
		HashSet s = new HashSet();
		
		s.add("pune");
		s.add("mumbai");
		s.add(11);
		s.add(12.12);
		s.add("pune");
		s.add("true");
		s.add(null);
		s.add(null);	
		s.add("satara");
		
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains("mumbai"));
		System.out.println(s.remove(11));
		System.out.println(s);
		
		
		// No use FOR LOOP in hashset class.
		// we cant use LIST ITERATOR CLASS in hashset method
		
		
		System.out.println("===========while loop==============");
		
		Iterator swapnil = s.iterator();
		
		while(swapnil.hasNext())
		{
			System.out.println(swapnil.next());
		}
		
		System.out.println("==========for each========");
		
		
		
	//	4) for EACH method
		
		for (Object rajesh:s)
		{
			System.out.println(rajesh);
		}
		
		





		
		
	
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
