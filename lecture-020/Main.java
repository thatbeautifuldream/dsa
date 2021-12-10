import java.util.Scanner;

public class Main {

    // String Compression :
    // 1st function : aabcccccaaa -> abca
    // 2nd function : aaabbccdddda -> a3b2c2d4a

    public static String compression1(String s) {
        String ans = "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                ans += s.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(compression1(s));
        sc.close();
    }
}