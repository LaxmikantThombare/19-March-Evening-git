package interfacestudy;

public class Son implements Father,Mother
{

	public static void main(String[] args) 
	{
    Son s =new Son();
    s.care();
    s.receipe();
    s.love();
    s.nature();
   // s.test();

    
	}

	@Override
	public void care() 
	{
       System.out.println(" mothers care completed in sons class");		
	}

	@Override
	public void receipe() 
	{
	       System.out.println(" mothers receipe completed in sons class");		

	}

	@Override
	public void love() 
	{
	       System.out.println(" fatehers love completed in sons class");		

	}

	@Override
	public void nature() 
	{
	       System.out.println(" fathers nature completed in sons class");		

	}

}
