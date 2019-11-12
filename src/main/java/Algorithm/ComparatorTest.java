package Algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorTest {
    public static Comparator<Employee> SalaryComparator = (e1, e2) -> (int) (e1.getSalary() - e2.getSalary());

    public static void main(String[] args) {
        Employee[] emArr = new Employee[4];
        emArr[1] = new Employee(17, "Wu", 21, 19000);
        emArr[2] = new Employee(18, "Gu", 28, 11000);
        emArr[3] = new Employee(21, "Xu", 21, 10900);
        emArr[0] = new Employee(10, "Wang", 25, 10000);


//        Arrays.sort(emArr,SalaryComparator);
//        System.out.println("Default Sorting of Employee list:\n" + Arrays.toString(emArr));

//        Arrays.sort(emArr, SalaryComparator);
//        System.out.println("Comparation by Salary:\n" + Arrays.toString(emArr));

        Integer[][] int2d = {
                {10,2,2},
                {3,4,5},
                {5,9,9}
        };

        /**
         * Stream
         */
        List<Integer> intList = Stream.of(int2d).flatMap(e->Stream.of(e))
                .distinct()             //delete the duplicates
                .filter(e->e>=4)        //
                .map(e->e*e)            //do calculation
                .sorted((e1,e2)->e2-e1) //sort the collection in ascending order(default)
                .peek(e->System.out.println(e))
                .limit(2)               //only select the first n element of collection
                .skip(1)                //skip the first n elements in the collection
                .collect(Collectors.toList());
        for(Integer i : intList){
            System.out.println(i);
        }
    }
}
