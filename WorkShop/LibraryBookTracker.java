import java.util.*;
public class LibraryBookTracker {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int[] borrow= new int[7];
        System.out.println("Enter number of books borrowed ");
        for(int i=0;i<7;i++){
            System.out.print("day "+(i+1)+": ");
            borrow[i] =sc.nextInt();
        }
        int total=0;
        int maxBorrow=borrow[0];
        int dayOMax=1;
        boolean holiday =false;
        for(int i=0;i<7;i++){
            total = total+borrow[i];
            if(borrow[i]>maxBorrow){
                maxBorrow=borrow[i];
                dayOMax =i+1;
            }
            if(borrow[i]==0){
                holiday =true;
            }
        }
        double avg= (double)total/7;
        System.out.println("--- Library report ---");
        System.out.println("Total book borrowed in week: "+total);
        System.out.println("Day with highest borrowing: Day "+dayOMax+ " ("+maxBorrow+" books");
        if(holiday){
            System.out.println("Yes, there was holiday");
        }
        else{
            System.out.println("No, holiday");
        }
        System.out.println("Average daily book borrowed "+avg);
        sc.close();

    }
}
