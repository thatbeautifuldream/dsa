
// !Agenda (Linked Lists Continued)
// Reverse Linked List (Data Iterative) 
// Reverse Linked List (Pointer Iterative) 
// Linked List To Stack Adapter
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

        public void reverseDI() {
            int i = 0;
            int j = size - 1;
            while (i <= j) {
                Node left = getNodeAt(i);
                Node right = getNodeAt(j);
                int temp = left.data;
                left.data = right.data;
                right.data = temp;
                i++;
                j--;
            }
        }

        public void reversePI() {
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
    }

    public static class LLToStackAdapter {
        LinkedList<Integer> list;

        public LLToStackAdapter() {
            list = new LinkedList<>();
        }

        int size() {
            return list.size();
        }

        void push(int val) {
            list.addFirst(val);
        }

        int pop() {
            return list.removeFirst();
        }

        int top() {
            return list.getFirst();
        }
    }

    public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // LinkedList list = new LinkedList();

        // Reverse Linked List (Data Iterative)
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
        // }
        // str = br.readLine();
        // }

        // Reverse Linked List Pointer Iterative
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
        // }
        // str = br.readLine();
        // }

        // Linked List To Stack Adapter
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LLToStackAdapter st = new LLToStackAdapter();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("push")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if (str.startsWith("pop")) {
                int val = st.pop();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("top")) {
                int val = st.top();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(st.size());
            }
            str = br.readLine();
        }
    }
}