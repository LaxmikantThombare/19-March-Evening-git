package array;

public class Array1 {

	public static void main(String[] args) {

		//ram,laxman,seeta        //12 may 2022
		
		String name[]= {"ram","laxman","seeta"};
		
		for (int i=0; i<=name.length; i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("**************");
		
		int rollno[]= {1,2,3,4,5,6};
		System.out.println("**********");
		
		
		
		
		
		
		
		
		
		int a[][]= new int[2][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		System.out.print(a[0][0]+" ");
		System.out.println(a[0][1]);
		System.out.print(a[1][0]+" ");
		System.out.print(a[1][1]);
		System.out.println("==================");
		for(int i=0;i<=a.length-1;i++)//0,1,2 row
		{
		for(int j=0;j<=a.length-1;j++)//0,1,2 column
		{
		System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
		}
		
		}
		
			
		
		
		

	


