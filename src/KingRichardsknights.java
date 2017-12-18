/*
QUESTION:https://www.hackerrank.com/challenges/king-richards-knights/problem
King Richard is leading a troop of  knights into battle! Being very organized, he labels his knights  and arranges them in an  square formation, demonstrated below:

knight1

Before the battle begins, he wants to test how well his knights follow instructions. He issues  drill commands, where each command follows the format ai bi di and is executed like so:

All knights in the square having the top-left corner at location  and the bottom-right corner at location  rotate  in the clockwise direction. Recall that some location  denotes the cell located at the intersection of row  and column . For example: image
You must follow the commands sequentially. The square for each command is completely contained within the square for the previous command. Assume all knights follow the commands perfectly.

After performing all  drill commands, it's time for battle! King Richard chooses knights  for his first wave of attack; however, because the knights were reordered by the drill commands, he's not sure where his chosen knights are!

As his second-in-command, you must find the locations of the knights. For each knight , , print the knight's row and column locations as two space-separated values on a new line.

Input Format

This is broken down into three parts:

The first line contains a single integer, .
The second line contains a single integer, . 
Each line  of the  subsequent lines describes a command in the form of three space-separated integers corresponding to , , and , respectively.
The next line contains a single integer, .
Each line  of the  subsequent lines describes a knight the King wants to find in the form of a single integer corresponding to .
Constraints

 and 
 and 
Subtask

 for  of the maximum score.
Output Format

Print  lines of output, where each line  contains two space-separated integers describing the respective row and column values where knight  is located.

Sample Input

7
4
1 2 4
2 3 3
3 4 1
3 4 0
7
0
6
9
11
24
25
48
Sample Output

1 1
1 7
4 6
3 4
2 5
2 4
7 7
Explanation

The following diagram demonstrates the sequence of commands:

Click here to download a larger image.

In the final configuration:

Knight  is at location 
Knight  is at location 
Knight  is at location 
Knight  is at location 
Knight  is at location 
Knight  is at location 
Knight  is at location 
*/
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
