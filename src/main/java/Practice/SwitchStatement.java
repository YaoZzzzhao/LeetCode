package Practice;

public class SwitchStatement {
    public static void main(String[] args) {
        int key = 2;
        String str1 = "";
        String str2 = "";
        //在switch...case...中，case相当于代码执行入口，一旦进入入口，case便会被忽略，只有遇到break或者return才会跳出或者结束；
        switch (key){
            case 1:
                str1 = "1";
            case 2:
                str1 = "2";
                break;
            case 3:
                str1 = "3";
            case 4:
//                str1 = "4";
                str2 = "common";
                break;
            case 5:
                str1 = "5";
                break;
            default:
                str1 = "default";
                str2 = "default";
                break;

        }
        System.out.println(str1+", "+str2);
    }
}
