public class PracticeProblems {
    public static int countOccurrences(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                count++;
            }
        }
        return count;
    }

    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverse[j] = array[i];
            j++;
        }
        return reverse;
    }

    public static double sumGrid(double[][] grid) {
        double sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
        }
        return sum;
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }
}