# Level Order Traversal (Like BFS)

- Level order traversal is a traversal technique that is used to print the nodes of a tree in a level by level oder.

```text
        1
       / \
      2   3
     / \ / \
     4 5 6 7

LOT : 1 2 3 4 5 6 7
```

- We can use a queue to implement Level Order Traversal.
- Steps to implement Level Order Traversal:
  - Create an empty queue.
  - Enqueue root node to the queue.
  - While queue is not empty:
    - Dequeue a node from the queue.
    - Print the node.
    - Enqueue all the children of the dequeued node to the queue.

```java
import java.util.*;
public class Main{
    public static class pair{
        Node node;
        int state;
        pair(){}
        pair(Node node, int state){
            this.node = node;
            this.state = state;
        }
    }


    public static class Node{
        int val;
        Node left;
        Node right;

        Node(){}
        Node(int val){
            this.val = val;
        }

        Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void display(Node root){
        if(root == null)
            return;

        if(root.left != null){
            System.out.print(root.left.val);
        }
        else{
            System.out.print(".");
        }
        System.out.print(" <- " + root.val + " -> " );
        if(root.right != null){
            System.out.print(root.right.val);
        }
        else{
            System.out.print(".");
        }
        System.out.println();


        display(root.left);
        display(root.right);

    }

    public static void levelOrder(Node root){
        Queue<Node> qu = new LinkedList<>();
        //seeding
        qu.add(root);

        while(qu.size() > 0 ){
            //1. remove
            Node rem = qu.remove();

            //2. Work
            System.out.print(rem.val + " ");

            //3. Add all child If possible
            if(rem.left != null){
                qu.add(rem.left);
            }
            if(rem.right != null){
                qu.add(rem.right);
            }
        }
    }


    public static void main(String [] args){
        Integer [] arr = {50,25,12,null,null,37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null };
        Node root = new Node(arr[0]);
        Stack<pair> st = new Stack<>();
        pair rootPair = new pair(root, 1);
        st.push(rootPair);
        int idx = 1;
        while(st.size() != 0){
            pair peekPair = st.peek();

            if(peekPair.state == 1){
                peekPair.state++;
                if(arr[idx] != null){

                    Node leftChild = new Node(arr[idx]);
                    peekPair.node.left = leftChild;

                    st.push(new pair(leftChild, 1));


                }
                idx++;

            }
            else if(peekPair.state == 2){
                peekPair.state++;
                if(arr[idx] != null){

                    Node rightChild = new Node(arr[idx]);
                    peekPair.node.right = rightChild;

                    st.push(new pair(rightChild, 1));
                }
                idx++;
            }
            else{
                st.pop();
            }


        }


        // display(root);
        // System.out.println(height(root));
        levelOrder(root);

    }
}
```

HomeWork : [563. Binary Tree Tilt](https://leetcode.com/problems/binary-tree-tilt/)
