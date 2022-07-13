package Stringmethod;

public class Ignoreequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a= "akshay";
		String b= "AKSHAY";
		String c= "AKSSHAY";

		System.out.println(a==b);
		System.out.println("===========");
		// ignoreequals
		
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println("=============");
		
		
		//contains () method use
		
				String k="katraj";
			System.out.println(k.contains("kat"));
			System.out.println(k.contains("kt"));
			
			
		

		
		
		
		
		
		
	}

}
