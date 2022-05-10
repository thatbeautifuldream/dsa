import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
        sc.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if (n == 0) { // base case
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }
        ArrayList<String> ans = new ArrayList<String>();
        for (int i = 1; i <= 3; i++) {
            if (n - i >= 0) {
                ArrayList<String> rec = getStairPaths(n - i);
                for (String s : rec) {
                    ans.add(i + s);
                }
            }
        }
        // if (n - 1 >= 0) {
        // ArrayList<String> nm1 = getStairPaths(n - 1); // get all possible paths for
        // n-1 or 1 step
        // for (String s : nm1) {
        // ans.add("1" + s);
        // }
        // }
        // if (n - 2 >= 0) {
        // ArrayList<String> nm2 = getStairPaths(n - 2); // get all possible paths for
        // n-2 or 2 step
        // for (String s : nm2) {
        // ans.add("2" + s);
        // }
        // }
        // if (n - 3 >= 0) {
        // ArrayList<String> nm3 = getStairPaths(n - 3); // get all possible paths for
        // n-3 or 3 step
        // for (String s : nm3) {
        // ans.add("3" + s);
        // }
        // }
        return ans;
    }
}