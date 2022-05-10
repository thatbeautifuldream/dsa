
// ! Agenda :
// Linked Lists :
// * Get Value in Linked List
// * Add first in a Linked List
// * Add at index in Linked List
// * Remove Last In Linked List
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
            if (size == 0) {
                head = tail = new Node();
                head.data = val;
                head.next = null;
                size++;
            } else {
                Node temp = new Node();
                temp.data = val;
                temp.next = head;
                head = temp;
                size++;
            }
        }

        public void addAt(int idx, int val) {
            if (size == 0) {
                head = tail = new Node();
                head.data = val;
                head.next = null;
                size++;
            } else if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            } else if (idx == 0) {
                addFirst(val);
            } else if (idx == size) {
                addLast(val);
            } else {
                Node temp = new Node();
                temp.data = val;
                Node prev = head;
                for (int i = 0; i < idx - 1; i++) {
                    prev = prev.next;
                }
                temp.next = prev.next;
                prev.next = temp;
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
                // Node temp = head;
                // for (int i = 0; i < size - 2; i++) {
                // temp = temp.next;
                // }
                // tail = temp;
                // tail.next = null;
                // size--;
                Node penultimate = getNodeAt(size - 2);
                penultimate.next = null;
                tail = penultimate;
                size--;
            }
        }

        // private Node getNodeAt(int idx) {
        // if (size == 0) {
        // System.out.println("List is empty");
        // return null;
        // } else if (idx < 0 || idx >= size) {
        // System.out.println("Invalid arguments");
        // return null;
        // } else {
        // Node temp = head;
        // for (int i = 0; i < idx; i++) {
        // temp = temp.next;
        // }
        // return temp;
        // }
        // }

        private Node getNodeAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");
                return null;
            } else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");
                return null;
            } else {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();
        // !GET VALUE IN LINKED LIST
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
        // }
        // str = br.readLine();
        // }
        // !ADD FIRST IN LINKED LIST
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
        // }
        // str = br.readLine();
        // }
        // !ADD AT INDEX IN LINKED LIST
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
        // }
        // str = br.readLine();
        // }
        // !REMOVE LAST IN LINKED LIST
        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.startsWith("size")) {
                System.out.println(list.size());
            } else if (str.startsWith("display")) {
                list.display();
            } else if (str.startsWith("removeFirst")) {
                list.removeFirst();
            } else if (str.startsWith("getFirst")) {
                int val = list.getFirst();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("getLast")) {
                int val = list.getLast();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("getAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = list.getAt(idx);
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("addFirst")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addFirst(val);
            } else if (str.startsWith("addAt")) {
                int idx = Integer.parseInt(str.split(" ")[1]);
                int val = Integer.parseInt(str.split(" ")[2]);
                list.addAt(idx, val);
            } else if (str.startsWith("removeLast")) {
                list.removeLast();
            }
            str = br.readLine();
        }
    }
}