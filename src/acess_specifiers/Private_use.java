package acess_specifiers;

public class Private_use {

	public static void main(String[] args) {

		
		Private_use pu=new Private_use();
		pu.test2();
		pu.test3();
		pu.test4();

		
		
		
		
		
		
		public void test1()
		{
			System.out.println("this is private access specifiers");
		}
		void test2()
		{
			System.out.println("default specifiers");
			
			public void test3()
			{
				System.out.println("this is protected acerss specifiers");
			}
			
			public void test4()
			{
				System.out.println("this is public acerss specifiers");
			}
		}
		
		
		
		
		
		
		
	}

}
