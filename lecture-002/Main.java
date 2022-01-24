import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // int add = add(1, 2);
        // System.out.println(add);
        // int sub = subtract(2, 1);
        // System.out.println(sub);
        int num = sc.nextInt();
        printTable(num);
    }

    // no args no return
    public static void printMessage() {
        System.out.println("Hello World");
    }

    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // no return 2 args
    public static void printTabaleInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            printTable(i);
        }
    }

    // with RT and with ARG
    public static int add(int a, int b) {
        return a + b;
    }

    // with RT and with ARG
    public static int subtract(int a, int b) {
        return a - b;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
