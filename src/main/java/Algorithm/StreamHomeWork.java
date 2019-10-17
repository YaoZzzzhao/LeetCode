package Algorithm;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamHomeWork {
    public static void main(String[] args) {
        String s = "apple,orange,apple,banana,banana,apple";
        String[] ss = s.split(",");
        Map<String, Long> ans;
//        ans = Arrays.stream(ss)
//                .collect(groupingBy(Function.identity(), Collectors.counting()));   //print all elements and the number of each

        ans = Arrays.stream(ss).collect(groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(ans);
        Map.Entry<String, Long> r = ans.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(r);
//        ans.entrySet().forEach(entry->{
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        });
    }

}
