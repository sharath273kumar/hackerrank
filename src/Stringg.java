import java.util.*;
public class Stringg{
	public static void main(String []jain)
	{
		int count,flag;
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String word[]=new String[N];
		for(count=0;count<N;count++)
			word[count]=sc.next();
		String even="",odd="";
		//int evenCount=0,oddCount=0;
		for(flag=0;flag<N;flag++)
		{
			even="";
			odd="";
			//even+=word[flag].charAt(0);
		for(count=0;count<word[flag].length();count++)
		{
			if(count%2==0)
			even+=word[flag].charAt(count);
			else
			odd+=word[flag].charAt(count);
		}
		System.out.print(even+" ");
		System.out.println(odd);
		//System.out.println("\n");
		}
		
		sc.close();

	}
}