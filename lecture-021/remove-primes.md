# Remove Primes

> 1.  You are given an ArrayList of positive integers.
> 2.  You have to remove prime numbers from the given ArrayList and return the updated ArrayList.
>     `Note -> The order of elements should remain same.`

```
Input Format
A number N
arr1
arr2.. N numbers
Output Format
An Arraylist
Constraints
1 <= N <= 10000
Sample Input
4
3 12 13 15
Sample Output
[12, 15]
```

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

	public static boolean isPrime(int n) {

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    // reverse traversing the list since we are removing elements and
    // we don't want to skip any elements
    // since it will change indices after removal
    public static void removePrimes(ArrayList<Integer> al) {
        for (int i = al.size()-1; i >= 0; i--) {
            if (isPrime(al.get(i))) {
                al.remove(i);
            }
        }
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}

		removePrimes(al);
		System.out.println(al);
	}

}
```
