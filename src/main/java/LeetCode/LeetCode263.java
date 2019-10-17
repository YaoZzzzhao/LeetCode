package LeetCode;

/**
 * Ugly number
 *
 * check a given number is a ugly number or not;
 * an ugly number is the product of 2,3,5;
 */

public class LeetCode263 {
    public static boolean isUgly(int num) {
        if(num<=0) return false;
        while(num!=1){
            if(num%2==0){
                num=num/2;
            }else if(num%3==0){
                num=num/3;
            }else if(num%5==0){
                num=num/5;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 1025;
        System.out.println(isUgly(num));
    }
}
