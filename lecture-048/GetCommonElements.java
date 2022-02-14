import java.io.*;
import java.util.*;

public class GetCommonElements {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        // frequency map of a1[]
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int ele : a1) {
            hm.put(ele, hm.getOrDefault(ele, 0) + 1); // it will add the element if it is not present in the map
        }
        // frequency map of a2[]
        for (int ele : a2) {
            if (hm.containsKey(ele)) {
                System.out.println(ele);
                // remove
                hm.remove(ele); // it will remove the element if it is present in the map
            }
        }
        sc.close();
    }
}