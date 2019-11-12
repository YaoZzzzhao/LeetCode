package Algorithm;

public class CodingContest {
    static long halloweenParty(int k) {
        /*
         * Write your code here.
         */
        if(k <= 1) return 0;

        long l = (long)k;

        if (l%2==0){
            return (l/2)*(l/2);
        }else{
            return (l-1)*(l+1)/4;
        }

    }

    public static void main(String[] args) {
        System.out.println(halloweenParty(34321421));
    }
}
