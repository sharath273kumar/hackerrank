/*QUESTION
 * Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

If the book is returned on or before the expected return date, no fine will be charged (i.e.: .
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, .
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .
If the book is returned after the calendar year in which it was expected, there is a fixed fine of .
Input Format

The first line contains  space-separated integers denoting the respective , , and  on which the book was actually returned. 
The second line contains  space-separated integers denoting the respective , , and  on which the book was expected to be returned (due date).

Constraints

Output Format

Print a single integer denoting the library fine for the book received as input.

Sample Input

9 6 2015
6 6 2015
Sample Output

45
Explanation

Given the following return dates: 
Actual:  
Expected: 

Because , we know it is less than a year late. 
Because , we know it's less than a month late. 
Because , we know that it was returned late (but still within the same month and year).

Per the library's fee structure, we know that our fine will be . We then print the result of  as our output.
 */
import java.util.*;


public class LibraryFine {

    public static void main(String[] args) {
    	int fine=0;
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        if ((d1==d2&&m1==m2&&y1==y2)||(d1<d2&&m1==m2&&y1==y2)||(d1<d2&&m1<m2&&y1==y2)||(d1<d2&&m1<m2&&y1<y2)||(d1==d2&&m1<m2&&y1==y2)||(d1==d2&&m1<m2&&y1<y2)||(d1==d2&&m1==m2&&y1<y2))
        	fine=0;
        if(d1>d2&&m1==m2&&y1==y2)
        	fine=15*(d1-d2);
        else if(m1>m2&&y1==y2)
        {
        	//if(d1==d2)
        	fine=500*(m1-m2);
        	/*else if(d1>d2)
        		fine=15*(d1-d2)+500*(m1-m2);
        	else if(d2<d1)
        		fine =500*(m1-m2)-15*(d1-d2);*/
        }
        else if(y1>y2)
        {
        	//if(m1==m2&&d1==d2)
        		fine=10000;
        	/*else if(m2<m1&&d1==d2)
        		fine=500*(12-m2)+500*m1;*/      		
        		
        }
        System.out.println(fine);
        in.close();
        
    }
}
