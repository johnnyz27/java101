import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 8, 3};
        System.out.println("The integer -2 occurs " + PracticeProblems.countOccurrences(arr, -2) + " times");
        int[] reversed = PracticeProblems.reverseArray(arr);
        System.out.println("The reversed elements are " + Arrays.toString(reversed));

        double[][] grid = {{1.1, 2.2}, {3.3, 4.4}};
        System.out.println("Sum of grid: " + PracticeProblems.sumGrid(grid));
        
        System.out.println("Fibonacci number at position 5: " + PracticeProblems.fib(5));
    }
}