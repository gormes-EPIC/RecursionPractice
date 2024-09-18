public class FactorialRecursion {
    /**
     * Solve for the factorial of an integer n recursively
     * @param n an integer greater than 0
     * @return the factorial of n
     */
    public static int factorial(int n) {
        if (n == 0) {
            return 1;  // Base case: 0! is 1
        } else {
            return n * factorial(n - 1);  // Recursive case
        }
    }

}
