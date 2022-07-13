package extralogical_program;

public class Leapyear {

	public static void main(String[] args) {

		
		int year =2020 ;           // 2016= leap year
		if(year%4==0 && year%100!=0 || year%400==0 )
		{
			System.out.println("leap year");
		}
		
		else {
			System.out.println("it is not an leap year");
		}
		
		
		
	}

}
