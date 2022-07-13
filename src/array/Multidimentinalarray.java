package array;

public class Multidimentinalarray {

	public static void main(String[] args) {

		
		 int a[][]= new int [2][2];   // 1) ROW  2) COLUMN
		
		 a[0][0]=1;
		 a[0][1]=2;
		 a[1][0]=3;
		 a[1][1]=4;

		 System.out.print(a[0][0]+" ");
		 System.out.println(a[0][1]);
		 System.out.print(a[1][0]+" ");
		 System.out.print(a[1][1]+" ");
          System.out.println("************for loop**********");
		 
		 for (int i=0; i<=a.length-1;i++) //  row   //outer for loop
		 {
			 for(int j=0;j<=a.length-1;j++) //  column   //inner for loop
			 {
				 System.out.print(a[i][j]+" ");
			 }
				System.out.println(); 
		 }
		 System.out.println("******reverse loop**********");
		 
		 for (int  i=a.length-1;i>=0;i--) //  row
		 {
			 for(int j=a.length-1;j>=0;j--) //  column
			 {
				 System.out.print(a[i][j]+" ");
			 }
				System.out.println(); 
		 }
		 
		 
	}

}
