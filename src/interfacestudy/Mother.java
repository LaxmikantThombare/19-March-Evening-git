package interfacestudy;

public interface Mother {

	
	
	void care();
	void receipe();
	default void money()
	   {
		   System.out.println("mothers money");
	   }



static void test()
{
	   System.out.println("mothers test");
}
}