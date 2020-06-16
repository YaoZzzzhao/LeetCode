package Practice;

import java.util.Date;

public class TimerPractice {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 1;i<5;++i){
//            System.out.println(i);
//            Thread.sleep(3000);
        }

        String s = "{\"timestamp\":1590786158250,\"status\":404,\"error\":\"Not Found\",\"message\":\"No message available\",\"path\":\"/execute-BR-tasks\"}";
        s = s.replaceAll("[{}\"]","");
//        s = s.replaceAll("[,]","\n");
        s = s.replaceAll(":",": ");
        System.out.println(s);
    }
}
