package logicalprogrambysir;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ReversrString {

	public static void main(String[] args) 
	{

		Scanner sc =new Scanner(System.in);
		System.out.println("please enter string to be reversed");
		String a = sc.next();
		
	 String b="";
	 
	 for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		
		System.out.println("Original String is "+a);
		System.out.println("Reverse String is "+b);
		// Rajesh reach safely at home.
		
		
		
		
		
	}

}
