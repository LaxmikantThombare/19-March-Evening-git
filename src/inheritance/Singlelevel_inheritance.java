package inheritance;

public class Singlelevel_inheritance {

	public static void main(String[] args) {
		
		//  to  call mothers prop. i need mothers object
		
		
		Mother m =new Mother();   //created object of mother class
		
		

		Child c =new Child();// created childs prop
		
		m.nature();
		Mother.care();
		
		
		c.mobile();
		
		

	}

}
