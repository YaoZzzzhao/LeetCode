package Practice;

public class StringBuilderPrac {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("this is the first line,\n");
        str.append("this is the last line \n");
        System.out.println(str.toString().trim());
    }
}
