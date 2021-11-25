import java.util.Scanner;

public class Pattern {

    public static void printMatrix(int rows) {
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= rows; c++) {
                System.out.print(r + "" + c + " ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int rows) {
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= rows; c++) {
                if (r == c)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void pattern8(int rows) {
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= rows; c++) {
                if (r + c == rows + 1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static void pattern9(int rows) {
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= rows; c++) {
                if (r + c == rows + 1 || r == c)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

    // public static void pattern9GapStrategy(int rows) {
    // if (n % 2 == 0) {
    // n++;
    // }
    // int nsp1 = 0, nst = 1, nsp2 = n / 2 + 1;
    // for (int r = 1; r <= n; r++) {
    // // spaces
    // for (int csp = 1; csp <= nsp1; csp++) {
    // System.out.print("\t");
    // }
    // // stars
    // for (int cst = 1; cst <= nst; cst++) {
    // System.out.print("*\t");
    // }
    // // spaces
    // for (int csp = 1; csp <= nsp2; csp++) {
    // System.out.print("\t");
    // }
    // // stars
    // for (int cst = 1; cst <= nst; cst++) {
    // System.out.print("*\t");
    // }
    // if (r <= n / 2) {
    // nsp1++;
    // nsp2 -= 2;
    // } else {
    // nst++;
    // nsp2 -= 2;
    // }
    // System.out.println();
    // }
    // }

    public static void pattern10(int n) { // hollow diamond
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
            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
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

    public static void pattern1234(int n) {
        int nst = 1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(nst + "\t");
            }
            System.out.println();
            nst++;
        }
    }

    public static void pattern11(int n) {
        int nst = 1, count = 1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count++ + "\t");
            }
            System.out.println();
            nst++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern11(n);
        sc.close();
    }

}
