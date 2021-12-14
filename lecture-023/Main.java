import java.util.Scanner;

public class Main {

    public static int powerLinear(int n, int p) {
        return (n == 0) ? 1 : n * powerLinear(n, p - 1);
    }

    public static int powerLogarithmic(int n, int p) {
        return (p == 0) ? 1 : (p % 2 == 0) ? powerLogarithmic(n * n, p / 2) : n * powerLogarithmic(n * n, p / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(powerLinear(n, p));
        System.out.println(powerLogarithmic(n, p));
        sc.close();
    }
}
