import java.util.*;
// import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // declare and initialise hashmap
        // HashMap<keyDataType, valueDataType> hashMapName = new HashMap<keyDataType,
        // valueDataType>();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // add elements to hashmap
        hm.put("India", 628);
        hm.put("China", 837);
        hm.put("Dubai", 120);
        hm.put("India", 200);
        hm.put("Pak", 837);
        hm.put("USA", 443);

        // print hashmap
        // System.out.println(hm); // might not get in order due to hashmap

        // get value from hashmap
        System.out.println(hm.get("India"));

        // containsKey() method returns true if key is present in hashmap
        boolean isChinaPresent = hm.containsKey("China"); // returns true or false depending on key's presence
        boolean isBangladeshPresent = hm.containsKey("Bangladesh"); // returns false
        System.out.println(isChinaPresent); // true
        System.out.println(isBangladeshPresent); // false

        // keySet() method returns set of keys
        for (String key : hm.keySet()) {
            System.out.println(key);
        }

        // size
        System.out.println(hm.size()); // 5 : number of elements/entry in hashmap
    }
}