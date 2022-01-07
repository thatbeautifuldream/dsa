# Add Last In Linked List

> 1. You are given a partially written LinkedList class.
> 2. You are required to complete the body of addLast function. This function is supposed to add an element to the end of LinkedList. You are required to update head, tail and size as required.
> 3. Input and Output is managed for you. Just update the code in addLast function.

```
   Input Format
   Input is managed for you
   Output Format
   Output is managed for you

Constraints
None
Sample Input
addLast 10
addLast 20
addLast 30
addLast 40
addLast 50
quit
Sample Output
10
20
30
40
50
5
50
```

## Solution

```java
import java.io.*;
import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node next;
    }

    // Create a new node with help of new
    // Assign the data to the new node
    // Connect tail and temp
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
    }

    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }
        System.out.println(list.size);

        if (list.size > 0) {
            System.out.println(list.tail.data);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList(); // Create a new object list, got a its memory at heap

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val); // member function called
            }
            str = br.readLine();
        }

        testList(list);
    }
}
```
