import java.util.Scanner;

public class Main {

    public static void pattern6(int n) { // hollow diamond
        if (n % 2 == 0) {
            n++;
        }
        int nsp = 1, nst = n / 2 + 1;
        for (int r = 1; r <= n; r++) {
            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if (r <= n / 2) {
                nst--;
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern6(n);
        sc.close();
    }

}
