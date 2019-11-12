package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Ping");
        str.add("Zhao");
        str.add("Xing");
        str.add("Yao");

        str.remove("Zhao");

        for(String i:str){
            System.out.println(i);
        }

    }
}
