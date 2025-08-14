import java.util.*;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costPrice = sc.nextDouble();
        double sellingPrice = sc.nextDouble();
        double profit = sellingPrice - costPrice;
        double profitPercent = (double) profit / costPrice * 100;

        System.out.println("The Cost Price is INR " + costPrice +
                           " and Selling Price is INR " + sellingPrice +
                           "\nThe Profit is INR " + profit +
                           " and the Profit Percentage is " + String.format("%.2f", profitPercent) + "%");
        sc.close();                   
    }
    
}
