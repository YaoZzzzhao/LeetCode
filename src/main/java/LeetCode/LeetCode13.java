package LeetCode;

import java.util.List;

/**
 * Roman to Integer
 */

public class LeetCode13 {
    public static int romanToInt(String s) {
        int ans = 0;

//        final Object obj;
    
        char[] c = s.toCharArray();
        int[] a = new int[c.length];
        for(int i = 0; i<c.length;i++){
            if(c[i] == 'I'){
                a[i] = 1;
            }else if(c[i] == 'V'){
                a[i] = 5;
            }else if(c[i] == 'X'){
                a[i] = 10;
            }else if(c[i] == 'L'){
                a[i] = 50;
            }else if(c[i] == 'C'){
                a[i] = 100;
            }else if(c[i] == 'D'){
                a[i] = 500;
            }else if(c[i] == 'M'){
                a[i] = 1000;
            }
        }
        for(int i = 0;i<a.length-1;i++){
            if(a[i]>=a[i+1]){
                ans+=a[i];
            }else{
                ans-=a[i];
            }
        }
        ans+=a[a.length-1];
        return ans;
    }

    public static void main(String[] args) {
        String s = "XVI";
        System.out.println(romanToInt(s));
    }
}
