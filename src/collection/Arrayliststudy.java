package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arrayliststudy {

	public static void main(String[] args) {

		
		
		ArrayList swapnil = new ArrayList();   //10 size of index no 0-9
		
		swapnil.add("velocityy");
		swapnil.add('A');
		swapnil.add(null);
		swapnil.add(null);
		swapnil.add(1234);
		swapnil.add(123.34);
		swapnil.add("true");
		swapnil.add("velocityy");
		swapnil.add(94033);
		
		System.out.println(swapnil);
		System.out.println(swapnil.size());
		System.out.println(swapnil.indexOf(1234));
		System.out.println(swapnil.remove(4));
		System.out.println(swapnil);
		swapnil.add(4, "anisha kale fan club");
		System.out.println(swapnil);
		//System.out.println(swapnil.size());
		//System.out.println(swapnil.size());
		//System.out.println(swapnil.size());
		//System.out.println(swapnil.size());
		//swapnil.add(swapnil)
		System.out.println("******************");

		// for loop
		for (int i=0;i<=swapnil.size()-1;i++)
		{
		System.out.println(swapnil.get(i));
		}
		System.out.println("**********************");
		
		
		// cursor in collection 
	    //1) iterator
		
		 Iterator it = swapnil.iterator();
		 
		 while (it.hasNext()) 
		 {
			 System.out.println(it.next());
		 }
		 
			 
			 System.out.println("*******************");
		 
			 
			 //2) list iterator
			 
			ListIterator lit =  swapnil.listIterator();
			
			while (lit.hasNext()) 
			{
				System.out.println(lit.next());              
			}
			
			//ene
			 
			
		}
}

		
		
		
		
		
		
		
		
				
				
		
		
		
		
		
		
		
		
		
	


