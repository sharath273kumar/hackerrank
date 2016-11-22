import java.util.*;

public class KingRichardsknights {

    public static void main(String[] args) {
    	int temporary,row,column,aI,bI;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N");
        int N=sc.nextInt();
        int n[][]=new int[N][N];
        int tempArray[][]=new int[N][N];
        temporary=0;
        for(row=0;row<N;row++)
        	for(column=0;column<N;column++)
        	{
        		n[row][column]=temporary;
        		temporary++;
        	}
       /* printing matrix n
        * for(row=0;row<N;row++)
		{
			for( column=0;column<N;column++)
				System.out.print(n[row][column]+" ");
			System.out.println("\n");
		}*/
        		
        System.out.println("Enter S");
        int S=sc.nextInt();
    	int aIvalue[]=new int[S];
    	int bIvalue[]=new int[S];    	
    	int dIvalue[]=new int[S];
    	for( row=0;row<S;row++)
    	{
    		aIvalue[row]=sc.nextInt();
    		bIvalue[row]=sc.nextInt();
    		dIvalue[row]=sc.nextInt();    		
    	}
    	System.out.println("Enter L");
    	int L=sc.nextInt();
    	int l[]=new int[L];
    	for(row=0;row<L;row++)
    	l[row]=sc.nextInt();
    	for(row=0;row<S;row++)
    	{
    		aI=aIvalue[row]+dIvalue[row];
    		bI=bIvalue[row]+dIvalue[row];
    	//rotating by 90
    	for(row=aIvalue[row];row<aI;row++)
			for( column=bIvalue[row];column<bI;column++)
			tempArray[column][row]=n[row][column];
		tempArray=n;
		for(row=aIvalue[row];row<aI;row++)
			for( column=bIvalue[row];column<bI/2;column++)
			{
				temporary=tempArray[row][column];
				tempArray[row][column]=tempArray[row][N-column-1];
				tempArray[row][N-column-1]=temporary;
			}
    	n=tempArray;
    	}
    	for(int flag=0;flag<L;flag++)
    		for(row=0;row<N;row++)
    			for(column=0;column<N;column++)
    			if(l[row]==n[row][column])
    				System.out.println(row+" "+column);
   sc.close();
    }
   
}