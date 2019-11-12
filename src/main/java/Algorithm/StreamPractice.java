package Algorithm;

import java.util.Arrays;
import java.util.Comparator;

public class StreamPractice {
    // Comparator practice using Employee class
    public static Comparator<Employee> salaryCom =(e1,e2) ->(int)(e2.getName().compareTo(e1.getName()));
    public static void main(String[] args){
        Employee[] arr = new Employee[6];
        arr[0] = new Employee(1,"Zhao",24,6000);
        arr[1] = new Employee(2,"Ping",24,6000);
        arr[2] = new Employee(3,"Leave",23,7700);
        arr[3] = new Employee(4,"Eason",46,4000);
        arr[4] = new Employee(5,"Jay",44,56000);
        arr[5] = new Employee(6,"Jinmu",22,33000);

        Arrays.sort(arr,salaryCom);
        System.out.println(Arrays.toString(arr));
//        for(Employee i:arr){
//            System.out.println(i);
//        }
    }
}
