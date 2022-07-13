package generalization;

public class Test_generalization {

	public static void main(String[] args) {

		
		Airtel A=new Airtel();
		System.out.println("==========");
		A.call();
		A.msg();
		A.data();
		A.myairtel();
		
		
		jio j=new jio();
		System.out.println("==========");
		j.call();
		j.msg();
		j.data();
		j.myjio();
		
		
		Vodafone v=new Vodafone();
		System.out.println("===========");
		v.call();
		v.msg();
		v.data();
		v.myvodafone();
		
		
		
	}

}
