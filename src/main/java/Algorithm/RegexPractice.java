package Algorithm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {
        String s = "My7 name is Khan10000. My name is Bob . My name is learning!";
        String line = "This order was placed for QT3000! OK?";
        String s2 = "wew544sss";
        String pattern = "(\\D+)(\\d+)(\\D+)";
        String pattern2 = "(\\d+)(.*)";
        Pattern r = Pattern.compile(pattern);
        Pattern r2 = Pattern.compile(pattern2);
        Matcher m = r.matcher(line);
        Matcher m2 = r2.matcher(s2);
        if (m2.find()) {
            System.out.println("Found value: " + m2.group(1));
            System.out.println("Found value: " + m2.group(2));
//            System.out.println("Found value: " + m2.group(3));
        }

//        if (m.find()) {
//            System.out.println("Found value: " + m.group(1));
//            System.out.println("Found value: " + m.group(2));
//            System.out.println("Found value: " + m.group(3));
//        }
        s = s.replaceAll("\\d", ",");

//        System.out.println(s2.length());
//        System.out.println(Pattern.matches());
    }
}
