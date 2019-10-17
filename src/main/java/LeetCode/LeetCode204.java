package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 */

public class LeetCode204 {
    public static int countPrimes(int n) {
//        if(n<=2) return 0;
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        for(int i=3;i<n;i++){
//            for(int j=0;j<list.size();j++){
//                if(i==n){
//                    return list.size();
//                }
//                if(i%list.get(j)==0){
//                    i++;
//                    j=-1;
//                    continue;
//                }
//                if((j==list.size()-1) &&(i%list.get(j)!=0)){
//                    list.add(i);
////                    System.out.println(i);
//                    i++;
//                    j=-1;
//                    continue;
//                }
//            }
//        }
//        return list.size();

        boolean[] primeOrNot = new boolean[n];
        int count = 0;
        for(int i = 2;i<n;i++){
            if(primeOrNot[i] == false){
                count++;
            }
            for(int j=2;i*j<n;j++){
                primeOrNot[i*j] = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println(countPrimes(n));
    }
}
