package LeetCode;

/**
 * Implementation of int sqrt(x);
 */

public class LeetCode69 {
    public static int mySqrt(int x) {
        int sqrt = 0;
        while(sqrt*sqrt>x || (sqrt*sqrt<x && (sqrt+1)*(sqrt+1)<x)){
           sqrt =  binary(sqrt,x);
        }
        return sqrt;
    }
    public static int binary(int sqrt,int x){
        if(sqrt * sqrt < x){
            sqrt = (sqrt+x)/2;
        }else if(sqrt * sqrt > x){
            sqrt = sqrt/2;
        }
        return sqrt;
    }

    public static void main(String[] args) {
        int x =4;
        System.out.println(mySqrt(x));
    }
}
