package Algorithm;

public class PassByValue {
    public static void test1(int x){
        x=x+5;
    }

    public static void main(String[] args) {
        int x = 10 | 3;
//        test1(x);
        System.out.println(x);
    }
}
