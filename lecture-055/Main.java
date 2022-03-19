import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Stack Creation
        Stack<Integer> st = new Stack<>();
        // Stack Push
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Stack Elements: " + st);

        // Stack Overflow
        while (true) {
            st.push(10); // Stack Overflows here
        }
        // fills up java heap memory

        


    }
}