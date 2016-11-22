import java.util.Scanner;

public class Rotateby90 {
	public static void main(String []args){
		int i,j=0,z=0;
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		for(i=0;i<n;i++)
			for( j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		for(i=0;i<n;i++)
			for( j=0;j<n;j++)
			b[j][i]=a[i][j];
		
		for(i=0;i<n;i++)
			for( j=0;j<n/2;j++)
				{z=b[i][j];
				b[i][j]=b[i][(n-1)-j];
				b[i][(n-1)-j]=z;}
		for(i=0;i<n;i++)
		{
			for( j=0;j<n;j++)
				System.out.print(b[i][j]+" ");
			System.out.println("\n");
		}
		sc.close();
		
		/*catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println(i+" "+j);
		}*/
		
		
		
	}

}
