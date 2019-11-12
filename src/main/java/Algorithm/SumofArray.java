package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class SumofArray {
    private static List<Integer> summation(int[] arr){
        int count = 0;
        int sum = 0;
        String s = "sss";
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<arr.length;i+=count){
            for(int j = i;j<=Math.min(i+count,arr.length-1);j++){
                sum+=arr[j];
            }
            list.add(sum);
            count++;
            sum = 0;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,6,8,5,9,4,7,2};
        for(Integer i : summation(arr)){
            System.out.println(i);
        }

    }
}
