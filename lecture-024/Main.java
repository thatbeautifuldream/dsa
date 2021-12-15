import java.util.Scanner;

public class Main {
    // Agenda
    // tower of hanoi
    // Recursion in arrays

    public static void toh(int n, int t1, int t2, int t3) {
        if (n == 0) {
            return;
        }
        toh(n - 1, t1, t3, t2);
        System.out.println(n + "[" + t1 + " -> " + t2 + "]");
        toh(n - 1, t3, t2, t1);
    }

    public static void displayArray(int[] a, int i) {
        if (i == a.length) {
            return;
        }
        System.out.println(a[i]);
        displayArray(a, i + 1);
    }

    public static void dar(int[] a, int i) {
        if (i == a.length) {
            return;
        }
        dar(a, i + 1);
        System.out.println(a[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int t1 = sc.nextInt();
        // int t2 = sc.nextInt();
        // int t3 = sc.nextInt();
        // toh(n, t1, t2, t3); // t1 -> t2 using t3
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        displayArray(a, 0);
        dar(a, 0); // display array reverse
        sc.close();
    }
}
