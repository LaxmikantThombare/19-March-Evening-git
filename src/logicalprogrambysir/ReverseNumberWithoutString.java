package logicalprogrambysir;

public class ReverseNumberWithoutString {

	public static void main(String[] args)
	{
		//123........>321
		
//		System.out.println(10/2);
//		System.out.println(10%2);
//		
//		System.out.println(123/10);
//		System.out.println(123%2);
//
//		System.out.println(12/10);
//		System.out.println(1/10);
		
		int num=123456789;
		int revNum=0;
		
		for(int i=num;i>0;i=i/10)  //123,12,1
		{
			int rem=i%10;          //3,2,1
			revNum=revNum*10+rem;
			//0+3...>3
			//30+2....>32
			//320+1....>321
			
			
		}
		System.out.println("Original Number is "+num);
		System.out.println("Reverse Number is "+revNum);

		
		
		
		
		
		
		
	}

}
