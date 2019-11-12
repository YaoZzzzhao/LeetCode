package Algorithm;

import java.util.Random;

public class TossCoin {
    public static double winRate(int n){
        boolean[] res = new boolean[n];
        int win = 0;
        for(boolean i:res){
            i = mockGamble();
            if(mockGamble()==true){
                win++;
            }
        }
        System.out.println(win);
        return win*1.0/n;
     }

     public static double generateRandom(){
         Random rand = new Random();
         return rand.nextDouble();
     }

     public static boolean mockGamble(){
        int cash = 100;
        int count = 1;
         while(cash > 0 && cash <200){
             if(generateRandom()>=0.5){
                 while(cash > 0 && cash <200) {
                     if(generateRandom()>=0.5){

                         cash -= Math.min(count * 10, cash);
                         if(cash==0) break;
                         count*=2;
                     }else{
                         cash += Math.min(count * 10, cash);
                         count=1;
                         break;
                     }
                 }
             }else{
                 while(cash > 0 && cash <200) {
                     if(generateRandom()<0.5){
                         cash -= Math.min(count * 10, cash);
                         if(cash==0) break;
                         count*=2;

                     }else{
                         cash += Math.min(count * 10, cash);
                         count=1;
                         break;
                     }
                 }
             }
         }

        if(cash==0) return false;
        return true;
     }

    public static void main(String[] args) {
        System.out.println(winRate(10000));
    }
}
