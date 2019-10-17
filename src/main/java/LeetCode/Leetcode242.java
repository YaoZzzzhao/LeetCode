package LeetCode;

import jdk.nashorn.internal.runtime.ListAdapter;

/**
 * Valid anagram
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 *  Note:
 * You may assume the string contains only lowercase alphabets.
 */

public class Leetcode242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] store = new int[26];
        for(int i=0;i<s.length();i++){
            store[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            store[t.charAt(i)-'a']--;
            if(store[t.charAt(i)-'a']<0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "cat";
        String t = "tcb";
        System.out.println(isAnagram(s,t));
    }
}
