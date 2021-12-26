# State of Wakanda - 2 (Diagonal Traversal)

```
The historic state of Wakanda has various monuments and souveniers which are visited by many travellers every day. The guides follow a prescribed route of visiting the monuments which improves them understand the relevance of each monument. The route of the monument is fixed and expressed in a 2-d matrix where the travellers visit the prescribed next monument. For example
1  2  3
4  5  6
7  8  9
is the prescribed route and the visitors travels this path: 1->2->3->4->5->6->7->8->9
However, a certain visitor decides to travel a different path as follows:
1. The visitor only plans to visit the upper diagonal triangle of the monument list.
2. The visitor travels diagonally till there are no more moves left in the current journey. 
3. He then visits the adjacent monument to the first monument of current diagonal journey. 
4. He continues the same path till all the monuments of the upper half have been travelled.
For Example:
The monuments are named as:
1    2    3    4
5    6    7    8
9   10  11  12
13 14  15  16
The path followed by the visitor is: 1->6->11->16->2->7->12->3->8->4
You are required to print the path followed by the traveller to visit all the monuments.
Refer to the photo for a better clarification.
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a.
3. You are required to diagonally traverse the upper half of the matrix and print the contents.
For details check image.

diagonal-traversal
Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
Output Format
Diagonal traversal

Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44
Sample Output
11
22
33
44
12
23
34
13
24
14
```

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void diagonalTraversal(int[][] arr) {
        // Gap Strategy: gap = (j - i)
        // *. gap decides the number of diagonals to be printed
        // 1. Find the length of the array
        // 2. Iterate through the array, starting at the top left corner
        // 3. Print the value at each position
        // *. diagonal traversal logic is : i++ and j++
        // 4. Move to the next position in the array
        // 5. Repeat until the end of the array is reached
        for (int gap = 0; gap < arr.length; gap++) {
            for (int i = 0, j = gap; j < arr.length; i++, j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        diagonalTraversal(arr);
        sc.close();
    }
}
```