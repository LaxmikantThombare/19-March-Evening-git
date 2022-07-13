package casting;

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Father f=new Father();
		Son s= new Son();
		f.car();
		f.bike();
		s.car();
		s.bike();
		//s.education();
		
		f1.bike();
		Father f1=new Son();
		System.out.println("**************");
		f1.car();
		//f1.education;
		
		
		
		
		
		
	}

}
