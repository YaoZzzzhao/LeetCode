package LeetCode;

/**
 * Plus One
 */

public class LeetCode66 {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] ans = new int[digits.length+1];
        ans[0] = 1;

        return ans;
    }

    public static void main(String[] args) {
        int[] a ={9,2,9};
        for(int i : plusOne(a)){
            System.out.println(i);
        }

    }
}
