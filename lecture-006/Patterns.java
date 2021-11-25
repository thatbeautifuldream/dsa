import java.util.Scanner;

public class Patterns {

    public static void pattern14(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }

    public static void starlike_pattern15(int n) {
        if (n % 2 == 0) {
            n++;
        }
        int nsp = n / 2, nst = 1;
        for (int r = 1; r <= n; r++) {
            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (r <= n / 2) {
                nst += 2;
                nsp--;
            } else {
                nst -= 2;
                nsp++;
            }
            System.out.println();
        }
    }

    public static void like_pattern15(int n) {
        if (n % 2 == 0) {
            n++;
        }
        int nsp = n / 2, nst = 1;

        for (int r = 1; r <= n; r++) {
            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            int count = (r <= n / 2 + 1) ? r : n - r + 1;
            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + "\t");
            }
            if (r <= n / 2) {
                nst += 2;
                nsp--;
            } else {
                nst -= 2;
                nsp++;
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        if (n % 2 == 0) {
            n++;
        }
        int nsp = n / 2, nst = 1;
        for (int r = 1; r <= n; r++) {
            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            int count = (r <= n / 2 + 1) ? r : n - r + 1;
            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + "\t");
                count = (cst <= nst / 2) ? count + 1 : count - 1;
            }
            if (r <= n / 2) {
                nst += 2;
                nsp--;
                count++;
            } else {
                nst -= 2;
                nsp++;
                count--;
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern15(n);
        sc.close();
    }
}
