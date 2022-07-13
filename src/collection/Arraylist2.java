package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist2 {

	public static void main(String[] args) {

		
		
		ArrayList s =new ArrayList();
		
		
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
		System.out.println("*****************");
		System.out.println(s.size());
		System.out.println(s.indexOf(11));
		System.out.println(s.lastIndexOf(null));
		System.out.println(s.isEmpty());
		System.out.println(s.remove(1));
		System.out.println(s);
		System.out.println(s.contains("pnue"));
		System.out.println(s);
		s.set(3, " rajesh");
		System.out.println(s);
		System.out.println("*******for loop******");

		
		for (int i=0;i<=s.size()-1;i++)
		{
			System.out.println(s.get(i));
		}

		
		System.out.println("==============end for loop===============");

       // 2- iteraor method
    Iterator ite = s.iterator();
    
    	while(ite.hasNext())
    	{
    	System.out.println(ite.next());
    	}
    		
    	System.out.println("==========list iterator method=========");
    	
    	//3- list iterator method
    	
    	ListIterator ite2 = s.listIterator();
         while (ite2.hasNext())
         {
        	 System.out.println(ite2.next());
         }
		  System.out.println("==========for each method=========");
         
		  //4- for each method
         
         for (Object swapnil:s)
         {
        	 System.out.println(swapnil);
         }
		  
		  
    	

		
		
		
		
		
	}

}
