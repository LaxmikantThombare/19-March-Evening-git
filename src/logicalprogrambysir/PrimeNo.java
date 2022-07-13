package logicalprogrambysir;

public class PrimeNo {

	public static void main(String[] args) 
	{
		//4---->3---,2-->11
		//swata ne  ani 1 ne bhag jato== Prime No
		int num =11;
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
				}
			
		}
        if(count==1)
        {
        	System.out.println("Given No Is Not A Prime Number");
        }
        else
        {
        	System.out.println("Given No Is  A Prime Number");

        }
		
		
		
		
		
		
		
		
		
		
	}

}
