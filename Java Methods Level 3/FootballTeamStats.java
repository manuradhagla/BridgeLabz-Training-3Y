import java.util.*;

public class FootballTeamStats {
    public static int getSum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double getMean(int[] heights) {
        return getSum(heights) / (double) heights.length;
    }

    public static int getShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    public static int getTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250
        }

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Shortest: " + getShortest(heights) + " cm");
        System.out.println("Tallest: " + getTallest(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm\n", getMean(heights));
    }
}
