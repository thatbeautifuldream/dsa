import java.util.Scanner;

public class Main {

    // Recursion Theory :
    // Faith : what the function does on itself (leave it to the function)
    // Expectation : (the recursive call) what the function does on the result of
    // the function (the recursive call)
    // Basically we're working with abstraction that the function we define does
    // it's work and the rest gets carried on its own!

    // Print Decreasing :
    public static void printDecreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

    // Memory Stack :
    // printDecreasing(5) -> 5
    // printDecreasing(4) -> 5 4
    // printDecreasing(3) -> 5 4 3
    // printDecreasing(2) -> 5 4 3 2
    // printDecreasing(1) -> 5 4 3 2 1
    // printDecreasing(0) -> 5 4 3 2 1 0
    // base case reached : return and stop recursion : pops all the way up

    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }

    // Memory Stack :
    // printIncreasing(5) -> gets pushed to the stack
    // printIncreasing(4) -> push
    // printIncreasing(3) -> push
    // printIncreasing(2) -> push
    // printIncreasing(1) -> push
    // printIncreasing(0) -> base case reaches so it returns and stops recursion,
    // pops all the way up
    // printIncreasing(1) -> prints 1 and pops up
    // printIncreasing(2) -> prints 1 2 and pops up
    // printIncreasing(3) -> prints 1 2 3 and pops up
    // printIncreasing(4) -> prints 1 2 3 4 and pops up
    // printIncreasing(5) -> prints 1 2 3 4 5 and pops up

    // Print Decreasing Increasing :
    public static void printDI(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDI(n - 1);
        System.out.println(n);
    }

    // Factorial :
    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    // Factorial Dry Run :
    // factorial(5) -> 5 * factorial(4)
    // factorial(4) -> 4 * factorial(3)
    // factorial(3) -> 3 * factorial(2)
    // factorial(2) -> 2 * factorial(1)
    // factorial(1) -> 1 * factorial(0)
    // factorial(0) -> 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // printDecreasing(n);
        // printIncreasing(n);
        // printDI(n);
        System.out.println(factorial(n));
        sc.close();
    }
}
