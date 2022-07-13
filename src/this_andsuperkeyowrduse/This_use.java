package this_andsuperkeyowrduse;

public class This_use {

	int a=600;  // non static global variable 

	
	public static void main(String[] args) {
	
		This_use t=new This_use();
	     t.addition();
	}
      public void addition()
      {

       int a=80;    //local variable
	int sum=a+900;
	System.out.println("adition is "+sum);
	System.out.println("value of non static variable is " +this.a);
      }
      }
