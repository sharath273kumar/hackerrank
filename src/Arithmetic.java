import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        
        int totalCost = (int) Math.round(mealCost+((tipPercent*mealCost)/100)+((taxPercent*mealCost)/100));
      
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}
