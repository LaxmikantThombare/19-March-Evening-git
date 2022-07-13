package logicalprogrambysir;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) 
	{
		//modulus = %
//		System.out.println(10/2);
//		System.out.println(10%2);
//		System.out.println(11/2);
//		System.out.println(11%2);// bghagile jaun baki kiti rahile te show krte
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Value");  
		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Number Is Even Number");
		}
		else
		{
			System.out.println("Number Is Odd Number");
		}
		
		
		
	}

}
