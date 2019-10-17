package LeetCode;

/**
 * Write a function that reverses a string. The input string
 * is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must
 * do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 */

public class LeetCode344 {
    public static void reverseString(char[] s) {
        int l = s.length;
        if(l == 0) return;
        char c;
        for(int i = 0; i<l/2; i++){
            c= s[i];
            s[i] = s[l-1-i];
            s[l-1-i] = c;
        }
    }

    public static void main(String[] args) {
        char[] c = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
        char[] r = {'a','m','a','n','a','P',' ',':','l','a','n','a','c',' ','a',' ',',','n','a','l','p',' ','a',' ',',','n','a','m',' ','A'};

        System.out.println(c);
        reverseString(c);
        System.out.println(c);
        System.out.println(r);
//        System.out.println(r.length);
//        for(char i : c ){
//            System.out.println(i);
//
//        }
    }
    char[] e = {'a','m','a','n','a','P',' ',':','l','a','n','a','c',' ',' ','a',',','n','a','l','p',' ','a',' ',',','n','a','m',' ','A'};
}
