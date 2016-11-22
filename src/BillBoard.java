/*
 * ADZEN is a popular advertising firm in your city that owns all  billboard locations on Main street. The city council passed a new zoning ordinance mandating that no more than  consecutive billboards be up at any given time. For example, if there are  billboards on Main street and , ADZEN must remove either the middle billboard, the first two billboards, or the last two billboards.

Being a for-profit company, ADZEN wants to lose as little advertising revenue as possible when removing the billboards. They want to comply with the new ordinance in such a way that the remaining billboards maximize their total profits (i.e., the total sum of all the billboards left standing on Main street).

Given , , and the revenue value of each of the  billboards, find and print the maximum profit that ADZEN can earn while complying with the zoning ordinance. Assume that Main street is a straight, contiguous block of  billboards that can be removed but cannot be reordered in any way.

Input Format

The first line contains two space-separated integers,  (the number of billboards) and  (the maximum number of billboards that can stand together on any part of the road). 
Each line  of the  subsequent lines contains an integer denoting the revenue value of billboard  (where ).

Constraints

Output Format

Print a single integer denoting the maximum profit ADZEN can earn from Main street after complying with the city's ordinance.

Sample Input 0

6 2   
1  
2  
3  
1  
6  
10 
Sample Output 0

21
Explanation 0 
There are  billboards, and we must remove some of them so that no more than  billboards are immediately next to one another.

We remove the first and fourth billboards, which gives us the configuration _ 2 3 _ 6 10 and a profit of . As no other configuration has a profit greater than , we print  as our answer.

Sample Input 1

5 4
1
2
3
4
5
Sample Output 1

14
Explanation 1 
There are  billboards, and we must remove some of them so that no more than  billboards are immediately next to one another.

We remove the first billboard, which gives us the configuration _ 2 3 4 5 and a profit of . As no other configuration has a profit greater than , we print  as our answer.
 */

import java.util.*;

public class BillBoard {
	
    public static void main(String[] args) {
    	
    	int amount=0,amt=0,samt;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.println("enter k");
        int k=sc.nextInt();
        int flag=k;
        for(int count=0;count<n;count++)
            ar[count]=sc.nextInt();
       for(int y=0;y<k;y++)
       {
    	   samt=0;
    	   amt=0;
    	   for(int z=0;z<y;z++)
           	samt+=ar[z];
        for(int x=y;x<n;x++)
            {        	
        	if(flag==k)
        	{
        		flag=0;
        		continue;        		
        	}
              amt+=ar[x];
              flag++;
            
            }
        amt=amt+samt;
            if(amt>amount)
                amount=amt;
      }
        System.out.println(amount);
        sc.close();
    }
    
}
