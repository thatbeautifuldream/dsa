
// !Agenda
// Kth node from the end of a linked list
// Midpoint of a linked list
// Merge Sort A Linked List
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
            Node s = head; // slow pointer
            Node f = head; // fast pointer
            while (f.next != null && f.next.next != null) {
                s = s.next; // slow pointer moves one node at a time
                f = f.next.next; // fast pointer moves twice as fast
            }
            return s.data;
        }

        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            Node c1 = l1.head; // current node of l1
            Node c2 = l2.head; // current node of l2
            LinkedList result = new LinkedList(); // result list initialized
            // if (c1 == null) {
            // return l2; // if l1 is empty, return l2
            // }
            // if (c2 == null) {
            // return l1; // if l2 is empty, return l1
            // }
            while (c1 != null && c2 != null) {
                if (c1.data < c2.data) {
                    result.addLast(c1.data); // add smaller element to result
                    c1 = c1.next; // move to next node of l1
                } else {
                    result.addLast(c2.data); // add smaller element to result
                    c2 = c2.next; // move to next node of l2
                }
            }
            if (c1 == null) { // if l1 is empty, add remaining elements of l2
                while (c2 != null) {
                    result.addLast(c2.data);
                    c2 = c2.next;
                }
            }
            if (c2 == null) { // if l2 is empty, add remaining elements of l1
                while (c1 != null) {
                    result.addLast(c1.data);
                    c1 = c1.next;
                }
            }
            return result; // return result
        }

        // Test program
        public static Node midNode(Node head, Node tail) { // returns mid node of a linked list
            Node slow = head; // slow pointer
            Node fast = head; // fast pointer
            while (fast != tail && fast.next != tail) { // if fast reaches end of list, slow will be at mid
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow; // return slow Node
        }

        public static LinkedList mergeSort(Node head, Node tail) {
            // write your code here
        }

    }

    public static void main(String[] args) throws Exception {
        // Mid of a linked list
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // LinkedList list = new LinkedList();

        // String str = br.readLine();
        // while (str.equals("quit") == false) {
        // if (str.startsWith("addLast")) {
        // int val = Integer.parseInt(str.split(" ")[1]);
        // list.addLast(val);
        // } else if (str.startsWith("size")) {
        // System.out.println(list.size());
        // } else if (str.startsWith("display")) {
        // list.display();
        // } else if (str.startsWith("removeFirst")) {
        // list.removeFirst();
        // } else if (str.startsWith("getFirst")) {
        // int val = list.getFirst();
        // if (val != -1) {
        // System.out.println(val);
        // }
        // } else if (str.startsWith("getLast")) {
        // int val = list.getLast();
        // if (val != -1) {
        // System.out.println(val);
        // }
        // } else if (str.startsWith("getAt")) {
        // int idx = Integer.parseInt(str.split(" ")[1]);
        // int val = list.getAt(idx);
        // if (val != -1) {
        // System.out.println(val);
        // }
        // } else if (str.startsWith("addFirst")) {
        // int val = Integer.parseInt(str.split(" ")[1]);
        // list.addFirst(val);
        // } else if (str.startsWith("addAt")) {
        // int idx = Integer.parseInt(str.split(" ")[1]);
        // int val = Integer.parseInt(str.split(" ")[2]);
        // list.addAt(idx, val);
        // } else if (str.startsWith("removeLast")) {
        // list.removeLast();
        // } else if (str.startsWith("removeAt")) {
        // int idx = Integer.parseInt(str.split(" ")[1]);
        // list.removeAt(idx);
        // } else if (str.startsWith("reverseDI")) {
        // list.reverseDI();
        // } else if (str.startsWith("reversePI")) {
        // list.reversePI();
        // } else if (str.startsWith("kthFromEnd")) {
        // int idx = Integer.parseInt(str.split(" ")[1]);
        // System.out.println(list.kthFromLast(idx));
        // } else if (str.startsWith("mid")) {
        // System.out.println(list.mid());
        // }
        // str = br.readLine();
        // }

        // Merge two sorted linked lists
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int n1 = Integer.parseInt(br.readLine());
        // LinkedList l1 = new LinkedList();
        // String[] values1 = br.readLine().split(" ");
        // for (int i = 0; i < n1; i++) {
        // int d = Integer.parseInt(values1[i]);
        // l1.addLast(d);
        // }

        // int n2 = Integer.parseInt(br.readLine());
        // LinkedList l2 = new LinkedList();
        // String[] values2 = br.readLine().split(" ");
        // for (int i = 0; i < n2; i++) {
        // int d = Integer.parseInt(values2[i]);
        // l2.addLast(d);
        // }

        // LinkedList merged = LinkedList.mergeTwoSortedLists(l1, l2);
        // merged.display();
        // l1.display();
        // l2.display();

        // Merge Sort A Linked List
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        LinkedList l1 = new LinkedList();
        String[] values1 = br.readLine().split(" ");
        for (int i = 0; i < n1; i++) {
            int d = Integer.parseInt(values1[i]);
            l1.addLast(d);
        }

        LinkedList sorted = LinkedList.mergeSort(l1.head, l1.tail);
        sorted.display();
        l1.display();
    }
}