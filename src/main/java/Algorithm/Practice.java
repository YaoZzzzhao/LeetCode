package Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        String[] arr = {"list","array","stack","queue"};
        List<String> list = new ArrayList<>();
        list.add("list");
        list.add("array");
        list.add("stack");
        list.add("queue");

        String[] convert = list.toArray(new String[0]);     //convert list to array;
//        System.out.println(Arrays.toString(convert));     //an easy way to print array;

        List<String> temp = Arrays.asList(arr);     //convert array to list;
        for(String i:temp){
            System.out.println(i);
        }
    }
}
