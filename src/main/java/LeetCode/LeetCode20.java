package LeetCode;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}',
 * '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */

public class LeetCode20 {
    public static boolean isValid(String s) {
        Stack ans = new Stack();
        if(s == null) return true;
        for(char i : s.toCharArray()){
            if(i == '(' || i == '[' || i == '{'){
                ans.push(i);
            }else if(ans.size() == 0){
                return false;
            }else if(i == ')' && (char)ans.peek() == '('){
                ans.pop();
            }else if(i == ']' && (char)ans.peek() == '['){
                ans.pop();
            }else if(i == '}' && (char)ans.peek() == '{'){
                ans.pop();
            }else{
                return false;
            }
        }
        if(ans.size() == 0 ) return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}
