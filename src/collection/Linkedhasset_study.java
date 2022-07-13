package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhasset_study {

	public static void main(String[] args) {

		
		
		LinkedHashSet ss =new LinkedHashSet();
		
		ss.add("ahmednagar");

		ss.add("pune");
		ss.add("pune");
		ss.add("A");
		ss.add("1");
		ss.add("null");
		ss.add("null");
		ss.add(true);
		ss.add("amravati");

		
		System.out.println(ss);
		
		//methods
		
		//for loop
		//for each
		//iterator
		
		System.out.println("=========for loop===========");
		
		// we cant use FOR LOOP method and LIST ITERATOR cursor.
		
		
//		for(int i=0;i<=ss.size()-1;i++)
//		{
//			System.out.println(ss.get);
//		}
		
		System.out.println("=====iterator============");
		
		Iterator mashuk = ss.iterator();
				
			while(mashuk.hasNext())
			{
				System.out.println(mashuk.next());
			}
		
			
			System.out.println("========for each=========");
			
			for (Object anishakalefanclub:ss)
			{
				System.out.println(anishakalefanclub);
			}
			
		
	}

}
