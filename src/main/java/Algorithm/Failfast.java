package Algorithm;


import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class Failfast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        map.put("aa",1);
        map.put("bb",1);
        map.put("cc",1);
        map.put("ee",1);
        map.put("pp",1);
        map.put("tt",1);
        map.put("as",1);

        list.add("bb");
        list.add("kk");
        list.add("yy");
        list.add("hh");
        list.add("ff");
        list.add("bb");
        list.add("bb");
        Iterator<String> it = list.iterator();
        Iterator<Map.Entry<String,Integer>> itr = map.entrySet().iterator();
//        while(it.hasNext()){
//            String s = it.next();
//            if(s.equals("bb")) it.remove();
//        }
        while(itr.hasNext()){
            Map.Entry<String,Integer> entry = itr.next();
            if(entry.getKey()=="aa"){
                itr.remove();
            }
        }

        for (Map.Entry<String, Integer> entry2 : map.entrySet()) {
            System.out.println(entry2.getKey() + ":" + entry2.getValue().toString());
        }

        System.out.println(map);
        List<String> l = list.stream().filter(e->!e.equals("bb")).collect(Collectors.toList());
//        for(String i : l){
//            System.out.println(i);
//        }

        String s1 = new String("ABC");
//        Object s2 = n;
        System.out.println(s1.concat("DEF"));
    }


}
