# Longest Consecutive Sequence Of Elements

`Hard`

> 1. You are given a number n, representing the size of array a.
> 2. You are given n numbers, representing elements of array a.
> 3. You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).

- Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.

## Constraints

- 1 <= n <= 30
- 0 <= n1, n2, .. n elements <= 15

## Format

## Input

- A number n

```
n1
n2
.. n number of elements
```

## Output

- Elements of longest sequence of consecutive elements of array in separate lines (ignoring duplicates)

## Example

## Sample Input

```
17
12
5
1
2
10
2
13
7
11
8
9
11
8
9
5
6
11
```

## Sample Output

```
5
6
7
8
9
10
11
12
13
```

## Solution

```java
import java.util.*;

public class Main {

    public static void longestConsecutiveSequenceOfElements(int arr[]) {
        // Step 1: Create HashMap

        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int ele : arr)
            hm.put(ele, true);

        // Step 2: Potential Starting point
        for (int ele : arr) {
            if (hm.containsKey(ele - 1))
                hm.put(ele, false);
        }

        // Step 3: Check for Longest len
        int maxLen = 0;
        int maxStPt = 0;
        for (int ele : arr) {
            if (hm.get(ele) == true) {
                int tempLen = 1;
                int tempStPt = ele;
                while (hm.containsKey(tempStPt + tempLen)) {
                    tempLen++;
                }
                if (tempLen > maxLen) {
                    maxLen = tempLen;
                    maxStPt = tempStPt;
                }
            }
        }
        for (int i = maxStPt; i < maxStPt + maxLen; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        longestConsecutiveSequenceOfElements(arr);
        sc.close();
    }
}
```
