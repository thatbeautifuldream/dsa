# K Reverse In Linked List

`Easy`

> 1. You are given a partially written LinkedList class.
> 2. You are required to complete the body of kReverse function. The function is expected to tweak the list such that all groups of k elements in the list get reversed and linked. If the last set has less than k elements, leave it as it is (don't reverse).
> 3. Input and Output is managed for you.

## Input Format

`Input is managed for you`

## Output Format

`Output is managed for you`

## Constraints

> 1. Time complexity -> O(n)
> 2. Space complexity -> constant

```text
Sample Input
11
1 2 3 4 5 6 7 8 9 10 11
3
100
200
Sample Output
1 2 3 4 5 6 7 8 9 10 11
3 2 1 6 5 4 9 8 7 10 11
100 3 2 1 6 5 4 9 8 7 10 11 200
```

## Solution

```java
// Agenda :
// K Reverse In Linked List
import java.io.*;
import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return -1;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }

            size++;
        }

        public void addAt(int idx, int val) {
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node node = new Node();
                node.data = val;

                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }
                node.next = temp.next;

                temp.next = node;
                size++;
            }
        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("List is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node temp = head;
                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }

                tail = temp;
                tail.next = null;
                size--;
            }
        }

        public void removeAt(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                removeFirst();
            } else if (idx == size - 1) {
                removeLast();
            } else {
                Node temp = head;
                for (int i = 0; i < idx - 1; i++) {
                    temp = temp.next;
                }

                temp.next = temp.next.next;
                size--;
            }
        }

        private Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void reverseDI() {
            int li = 0;
            int ri = size - 1;
            while (li < ri) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
            }
        }

        public void reversePI() {
            if (size <= 1) {
                return;
            }

            Node prev = null;
            Node curr = head;
            while (curr != null) {
                Node next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node temp = head;
            head = tail;
            tail = temp;
        }

        public int kthFromLast(int k) {
            Node slow = head;
            Node fast = head;
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }

            while (fast != tail) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow.data;
        }

        public int mid() {
            Node f = head;
            Node s = head;

            while (f.next != null && f.next.next != null) {
                f = f.next.next;
                s = s.next;
            }

            return s.data;
        }

        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            LinkedList ml = new LinkedList();

            Node one = l1.head;
            Node two = l2.head;
            while (one != null && two != null) {
                if (one.data < two.data) {
                    ml.addLast(one.data);
                    one = one.next;
                } else {
                    ml.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                ml.addLast(one.data);
                one = one.next;
            }

            while (two != null) {
                ml.addLast(two.data);
                two = two.next;
            }

            return ml;
        }

        public static Node midNode(Node head, Node tail) {
            Node f = head;
            Node s = head;

            while (f != tail && f.next != tail) {
                f = f.next.next;
                s = s.next;
            }

            return s;
        }

        public static LinkedList mergeSort(Node head, Node tail) {
            if (head == tail) {
                LinkedList br = new LinkedList();
                br.addLast(head.data);
                return br;
            }

            Node mid = midNode(head, tail);
            LinkedList fsh = mergeSort(head, mid);
            LinkedList ssh = mergeSort(mid.next, tail);
            LinkedList sl = mergeTwoSortedLists(fsh, ssh);
            return sl;
        }

        public void removeDuplicates() {
            LinkedList nl = new LinkedList(); // new list
            while (this.size > 0) {
                int val = this.getFirst();
                this.removeFirst();
                if (nl.size == 0 || nl.tail.data != val) {
                    nl.addLast(val);
                }
            }
            this.head = nl.head; // deep copy
            this.tail = nl.tail; // deep copy
            this.size = nl.size; // deep copy

        }

        public void oddEven() {
            LinkedList odd = new LinkedList(); // list of odd
            LinkedList even = new LinkedList(); // list of even
            while (this.size > 0) { // while list is not empty
                int val = this.getFirst(); // get first element
                this.removeFirst(); // remove first element
                if (val % 2 == 0) { // if even
                    even.addLast(val); // add to even list
                } else { // if odd
                    odd.addLast(val); // add to odd list
                }
            }
            /*
             * corner case : if odd/even list is empty or present
             * odd even (combinations)
             * 1 1
             * 1 0
             * 0 1
             */
            if (odd.size > 0 && even.size > 0) { // if both lists are present
                odd.tail.next = even.head; // connect odd list to even list
                this.head = odd.head; // list starts with odd list
                this.tail = even.tail; // list ends with even list
                this.size = odd.size + even.size; // size of new list
            } else if (odd.size > 0) { // if only odd list is present
                this.head = odd.head; // list starts with odd list
                this.tail = odd.tail; // list ends with odd list
                this.size = odd.size; // size of new list is the size of odd list
            } else if (even.size > 0) { // if only even list is present
                this.head = even.head; // list starts with even list
                this.tail = even.tail; // list ends with even list
                this.size = even.size; // size of new list is the size of even list
            }
        }

        public void kReverse(int k) {
            if (k > this.size) {
                return;
            }
            LinkedList ans = new LinkedList();
            while (this.size >= k) {
                LinkedList tmp = new LinkedList(); // temp list
                for (int i = 0; i < k; i++) {
                    int val = this.getFirst(); // get first element
                    this.removeFirst(); // remove first element
                    tmp.addFirst(val); // add to temp list (addFirst ensures that the list is reversed)
                }

                if (ans.size == 0) {
                    ans = tmp; // shallow copy of temp list
                } else {
                    ans.tail.next = tmp.head; // connect ans list to temp list
                    ans.tail = tmp.tail; // update tail of ans list
                    ans.size += tmp.size; // update size of ans list
                }

            }

            // left elements
            if (this.size > 0) {
                ans.tail.next = this.head; // connect ans list to left elements
                ans.tail = this.tail; // update tail of ans list
                ans.size += this.size; // update size of ans list
            }

            this.head = ans.head; // deep copy
            this.tail = ans.tail;
            this.size = ans.size;
        }
    }

    public static void main(String[] args) throws Exception {
        // !K Reverse In Linked List

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.addLast(d);
        }

        int k = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        l1.display();
        l1.kReverse(k);
        l1.display();
        l1.addFirst(a);
        l1.addLast(b);
        l1.display();
    }
}
```
