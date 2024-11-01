public class CombinationCalculator {

    // Method to calculate factorial of a number
    public static double factorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate combination (nCr)
    public static double combination(int n, int r) {
        if (r > n) {
            return 0; // Invalid case, r cannot be greater than n
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}