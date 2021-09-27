import java.util.Scanner;
public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }
        int nmrfact = 1;
        for (int i = 1; i <= n - r; i++) {
            nmrfact *= i;
        }
        int npr = nfact / nmrfact;
        System.out.println(n+"P"+r+" = "+npr);
        sc.close();
    }
}