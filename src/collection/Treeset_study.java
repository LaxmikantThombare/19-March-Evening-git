package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset_study {

	public static void main(String[] args) {

		// cant run differnt datatypes in tree set.
		
		TreeSet sss = new TreeSet();
		
		
		sss.add("ahmednagar");
		sss.add("pune");
		sss.add("pune");
		sss.add("mumbai");
		sss.add("satara");
		sss.add("swapnil");
		sss.add("rajesh");		
		
		System.out.println(sss);
		
		System.out.println(sss.size());
		
		// we cant use FOR LOOP and LIST ITERATOR method in set interface.
		
//		for (int i=0; i<=sss.size()-1;i++)
//		{
//			System.out.println(sss.);
//		}

		System.out.println("=====for each==========");
		for (Object swapnil:sss)
		{
			System.out.println(swapnil);
		}
		
		
		System.out.println("=============iterator cursor use=========");
		
		
		Iterator sammi = sss.iterator();
		
		
		while (sammi.hasNext())
		{
			System.out.println(sammi.next());
		}
		
		
	
		
		
		
		
	}

}
