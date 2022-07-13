package logicalprogrambysir;

import java.util.Scanner;

public class Pallen_drome {

	public static void main(String[] args) 
	{
		//pallendrop =firun firun tech value yene
		
		Scanner sc =new Scanner(System.in);
		System.out.println("please enter a string");
		
		String org=sc.next();
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev= rev+org.charAt(i);
			  
		}
		
		System.out.println("Original String is "+org);
		System.out.println("Reverse String is "+rev);
		if(org.equals(rev))
		{
			System.out.println("Given String Is Pallendrome");

		}
		
		else
		{
			System.out.println("Given String Is Not Pallendrome");

		}
		
		
		//saral vachli kivaa ulti letter same ale phije
		
		
		
		
		
		
	}

}
