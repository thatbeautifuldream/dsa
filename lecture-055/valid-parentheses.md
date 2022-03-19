# Leetcode | 20. Valid Parentheses

> Problem [Link](https://leetcode.com/problems/valid-parentheses/)

```java
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            }
            else {
                if(st.size() == 0) {
                    return false;
                }
                if(ch == '}' && st.peek() != '{') {
                    return false;
                }
                else if(ch == ']' && st.peek() != '[') {
                    return false;
                }
                else if(ch == ')' && st.peek() != '(') {
                    return false;
                }
                else {
                    st.pop();
                }
            }
        }
        if(st.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
```
