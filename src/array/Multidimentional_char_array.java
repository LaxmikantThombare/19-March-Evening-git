package array;

public class Multidimentional_char_array {

	public static void main(String[] args) {

		char grade[][]= {{'a','b'},{'c','d'}};  //rows 0,1;1,0;1,1;0,0
		
		for(int i=0;i<=grade.length-1; i++)  //outer loops for rows

		{
		for (int j=0;j<=grade.length-1; j++)	//inner loops for column
		{
			System.out.print(grade[i][j]+" ");
		}
		System.out.println( ); 
		}
		  System.out.println("*******");
		  
		for(int i=grade.length-1;i>=0;i--)  //outer loops for rows

		{
		for (int j=grade.length-1;j>=0; j--)	//inner loops for column
		{
			System.out.print(grade[i][j]+" ");
		}
		System.out.println(" ");
		}
	System.out.println("** for 2*3 matrix **");
	
		int a[][] = {{1,2,3},{4,5,6}};
		
		for(int i=0;i<=1;i++) ///row max index = length -1 
		{
			for(int j=0;j<=2;j++)  ///column max index = length -1
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println( );
		}
		System.out.println("***********");
		
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println( );
		}
		
		
		
		
		
		
		
//int a[][]= {{1,2,3},{4,5,6}};
		
	//	for(int i=0;i<=1;i++)
		{
	//		for(int j=0;j<=2;j++)
			{
	//			System.out.print(a[i][j]+" ");
			}
	//		System.out.println();
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		}
