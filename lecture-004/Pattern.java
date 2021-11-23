import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
