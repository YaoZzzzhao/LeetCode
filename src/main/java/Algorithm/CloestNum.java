package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CloestNum {
    public static void close(List<Integer> numbers){
        int min = Integer.MAX_VALUE;
        int[] res = new int[2];
        for(Integer i : numbers){
            if(Math.abs(i)<min){
                min = Math.abs(i);
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        Collections.sort(numbers);
        for(Integer i : numbers){
            if(map.containsKey(i-min)){
                res[0] = i-min;
                res[1] = i;
                for(int k:res){
                    System.out.print(k + " ");
                }
                System.out.println();
                map.put(i,1);
            }else{
                map.put(i,1);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(-2);
        list.add(-8);
        list.add(7);
        list.add(6);
        list.add(4);
        close(list);
    }
}
