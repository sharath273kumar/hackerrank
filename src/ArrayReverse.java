import java.util.*;
public class ArrayReverse {
	public static void main(String [] a)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int array[]=new int[N];
		for(int count=0;count<N;count++)
			array[count]=sc.nextInt();
		for(int count=N;count<0;count--)
			System.out.println(array[count]+" ");
		sc.close();
		}
}
