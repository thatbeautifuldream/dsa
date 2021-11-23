import java.util.Scanner;

public class GcdLcmNaive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 0, lcm, count = 1, small;
        small = (num1 < num2) ? num1 : num2;

        while (count <= small) {
            if (num1 % count == 0 && num2 % count == 0) {
                gcd = count;
            }
            count++;
        }

        lcm = (num1 * num2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}