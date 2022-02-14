import java.util.*;

public class HighFreqChar {
    public static void main(String[] args) {
        // to get maximum frequency character using hashmap
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.containsKey(ch)) {
                int val = hm.get(ch);
                hm.put(ch, val + 1); // repeat character
            } else {
                hm.put(ch, 1); // first time seeing this character
            }
        }

        char maxFreqChar = s.charAt(0);
        for (Character key : hm.keySet()) {
            if (hm.get(key) > hm.get(maxFreqChar)) {
                maxFreqChar = key; // update maxFreqChar if current key is greater than maxFreqChar
            }
        }
        System.out.println(maxFreqChar);
        sc.close();
    }
}