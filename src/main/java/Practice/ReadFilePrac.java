package Practice;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFilePrac {
    // use stream in java 8
    private static String readLineByLineJava8(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        Stream<String> stream = Files.lines(Paths.get(filePath), StandardCharsets.UTF_8);
        stream.forEach(s -> sb.append(s).append("\n"));
        return sb.toString();
    }

    //Files.readAllBytes(Path path) - Java 7 and above
    private static String readAllBytesJava7(String filePath) throws IOException{
        String content="";
        content = new String(Files.readAllBytes(Paths.get(filePath)));
        return content;
    }



    public static void main(String[] args) throws IOException {
//        System.out.println(readLineByLineJava8("/Users/yaozhao/Documents/fileTest111.txt"));
        String s = readAllBytesJava7("/Users/yaozhao/Documents/fileTest111.txt");
//        String pattern = "([a-z+])(www.*\:.*\\/.*)([a-z+)";

    }
}
