package LeetCode;

import java.util.Stack;

/**
 * We are given that the string "abc" is valid.
 *
 * From any valid string V, we may split V into two pieces X
 * and Y such that X + Y (X concatenated with Y) is equal to V.
 * (X or Y may be empty.)  Then, X + "abc" + Y is also valid.
 *
 * If for example S = "abc", then examples of valid strings are:
 * "abc", "aabcbc", "abcabc", "abcabcababcc".  Examples of invalid strings are: "abccba", "ab", "cababc", "bac".
 *
 * Return true if and only if the given string S is valid.
 */

public class LeetCode1003 {
    public static boolean isValid(String S) {
        Stack<Character> stack = new Stack<>();
        if(S.length()==0 || S.length()%3!=0) return false;
        for(int i=0;i<S.length();i++){
            if(/*stack.size()>1 && */ S.charAt(i)=='c'){
                if(stack.peek()=='b'){
                    stack.pop();
                    if(stack.peek()=='a');{
                        stack.pop();
                    }
                }else return false;
            }else {
                stack.push(S.charAt(i));
            }
        }
        if(stack.size()==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "aabcbc";
        System.out.println(isValid(s));
    }
}
