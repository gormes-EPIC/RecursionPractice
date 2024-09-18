public class FactorialIteration {
    /**
     * Solve for the factorial of an integer n iteratively
     * @param n an integer greater than 0
     * @return the factorial of n
     */
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
