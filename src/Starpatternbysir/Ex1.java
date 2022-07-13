package Starpatternbysir;

public class Ex1 {

	public static void main(String[] args) 
	
	{
		//*
		//**
		//***
		//****
		//*****
		//row------->5
		//column---->5
		//Step 1: Count Rows = 05 Count Columns = 05
		
		int star=5; // Write No of star in first Row
		
		for(int i=1;i<=5;i++)    // Outer for loop used for Rows
		{
			for(int j=1;j<=star;j++)   // Inner Loop for Columns
			{
			 System.out.print("*"); // after printing star go on next line
			}  
			star--;                     // Increment in stars
			
			System.out.println();
			
		}
		
		
	}

}
