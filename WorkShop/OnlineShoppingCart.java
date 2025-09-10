import java.util.*;
public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of item in cart: ");
        int n=sc.nextInt();
        double[] prices=new double[n];
        System.out.println("Enter the prices of item in cart: ");
        for(int i=0;i<n;i++){
            prices[i]=sc.nextDouble();
        }
        double total=0;
        for(int i=0;i<n;i++){
            total = total+prices[i];
        }
        if(total>5000){
            total= total-(total*0.10);
        }
        if(total<2000){
            total+=100;
        }
        System.out.println("---- Shopping Cart Payable Amount ----");
        System.out.println("Final payable amount: Rs.%.2f\n"+total);
        sc.close();
    }
    
}
