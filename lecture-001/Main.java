import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        // 1 to 10
        // while (i <= 10) {
        // System.out.println(i);
        // i = i + 1;
        // }

        // 11 to 20
        // for (i = 11; i <= 20; i++) {
        // System.out.println(i);
        // }

        // print number in dec order
        // for (i = 10; i > 0; i--) {
        // System.out.println(i);
        // }

        // table of 2
        // for (i = 2; i <= 20; i += 2) {
        // System.out.println(i);
        // }

        // to print table
        // int tableNumber = 13;
        // for (int num = 1; num <= 10; num++) {
        // System.out.println(tableNumber + " x " + num + " = " + (tableNumber * num));
        // }

        // Primes
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        int num = sc.nextInt();
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);

    }
}
