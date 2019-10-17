package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class PrintPrimeNumber {
    public static List<Integer> getPrimeNumber(int n){
        List<Integer> list = new ArrayList<>();
        if(n==1) return list;
        for(int i = 2;i<=n;i++){
            for(int j = 2;j<=i;j++){
                if(j==i) list.add(i);
                if(i%j==0) {
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        for(Integer i : getPrimeNumber(100)){
            System.out.println(i);
        }
    }
}
