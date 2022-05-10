# Highest Frequency Character

`Easy`

> 1. You are given a string str.
> 2. You are required to find the character with maximum frequency.

## Constraints

> 0 < str.length() <= 100
> There will be a single character with highest frequency

## Format

## Input

> A string str

## Output

> The character with highest frequency

## Example

## Sample Input

> zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc

## Sample Output

> q

## Solution

```java
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
            // hm.put(ch, hm.getOrDefault(ch, 0) + 1);
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
```

```bash
> java HighFreqChar.java
aaaabbb
a
```

## Dry Run

| Character | Integer |
| :-------: | :-----: |
|     a     |    4    |
|     b     |    3    |

> So, we have 4 a's and 3 b's. Output is a because it has highest frequency.
