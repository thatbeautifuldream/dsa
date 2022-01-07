// ! Agenda :
// Linked Lists

/*
* Linked List  : ADT (Abstract Data Type)
* Head, Tail, Size (Data Members)
* Add, Remove, Get, Set, Contains, Clear, Reverse, Sort (Member Functions)
*/

// static function can only call static function, methord, variable

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
        Node head; // head of list of Node type
        Node tail; // tail of list of Node type
        int size; // size of list

        void addLast(int val) {
            Node temp = new Node(); // Create a new node with help of new
            temp.data = val; // Assign the data to the new node
            if (size == 0) { // If list is empty then head and tail will point to the same node
                head = temp;
                tail = temp;
            } else { // If list is not empty then tail will point to the new node
                tail.next = temp;
                tail = temp;
            }
            size++; // Increment the size of list
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
