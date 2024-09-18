public class FactorialRunner {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Iteratively, the factorial of " + n + " is " + FactorialIteration.factorial(n));
        System.out.println("Recursively, the factorial of " + n + " is " + FactorialRecursion.factorial(n));
    }

}
