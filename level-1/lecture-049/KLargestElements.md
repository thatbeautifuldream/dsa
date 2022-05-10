# K Largest Elements

`Easy`

> 1. You will be given an Array with its length
> 2. You will also be given an integral value k
> 3. You need to find k largest elements from the given array
> 4. Input is handled for you
> 5. It is a functional problem ,please do not modify main()

## Constraints

- 1 <= N <= 100
- K <= N
- -1000 <= C[i] <= 1000

## Format

## Input

- Input is handled for you

## Output

- Output MUST be in descending order

## Example

## Sample Input

```
8
44 -5 -2 41 12 19 21 -6
2
```

## Sample Output

`44 41`

## Solution

```java

import java.util.*;

public class Main {

    public static void kLargestElements(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        for (int i = 0; i < arr.length; i++) {
            if (i < k)
                pq.add(arr[i]); // add all elements to the heap at max k times
            else {
                if (arr[i] > pq.peek()) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        kLargestElements(arr, k);
        sc.close();
    }
}
```
