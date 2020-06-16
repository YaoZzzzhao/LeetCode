package Algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {
    // Comparator practice using Employee class
    public static Comparator<Employee> salaryCom =(e1,e2) ->(int)(e2.getName().compareTo(e1.getName()));
    public static Comparator<Employee> idComparator = Comparator.comparingInt(Employee::getId);
    public static void main(String[] args){
        Employee[] arr = new Employee[6];
        arr[0] = new Employee(1,"Zhao",24,6000);
        arr[1] = new Employee(2,"Ping",24,6000);
        arr[2] = new Employee(3,"Leave",23,7700);
        arr[3] = new Employee(4,"Eason",46,4000);
        arr[4] = new Employee(5,"Jay",44,56000);
        arr[5] = new Employee(6,"Jinmu",22,33000);

        Arrays.sort(arr,salaryCom);
//        args[1].trim
//        System.out.println(Arrays.toString(arr));
//        for(Employee i:arr){
//            System.out.println(i);
//        }

        // Using stream to reverse the key and value of a map; if the value has duplicates, add the value and take the sum as a key;
        Map<String, String> map = new HashMap<>();
        map.put("Yao","Great");
        map.put("Zhao", "Great");
        map.put("Yishan","Stupid");
        Map<String,String> map2 = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey,(e1,e2)->e1+e2));

        // Two ways to print a map: 1. using stream and foreach:
        map2.forEach((key,value)->System.out.println(key+":"+value));

        // 2. using entryset
//        for(Map.Entry<String,String> entry:map2.entrySet()){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }
    }
}
