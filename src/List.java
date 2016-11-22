import java.util.Scanner;

public class List {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int answer=recurssion(n,1);
		
		sc.close();
		System.out.println(answer);
	}
	public static int recurssion(int fact,int ans)
	{
		
		if(fact>0)
		{
			ans=ans*fact;
			recurssion(fact-1,ans);
		}
		return ans;
		
	}
	

}
