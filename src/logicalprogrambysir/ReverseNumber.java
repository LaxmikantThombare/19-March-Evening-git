package logicalprogrambysir;

public class ReverseNumber {

	public static void main(String[] args) 
	{

		
		int num=123;
		String strnum = Integer.toString(num);
		
		String rev="";
		for(int i=strnum.length()-1;i>=0;i--)
		{
			rev=rev+strnum.charAt(i);
		}
		
		int revnum = Integer.parseInt(rev);
		
		System.out.println("Original Number Is "+num);
		System.out.println("Reverse Number Is "+revnum);

		
		
		
		
		
		
		
		
		
	}

}
