package Algorithm;

public class Fibo {
    public static long fibo1(long n){
        if(n == 0) return 1;
        if(n == 1) return 2;
        return fibo1(n-1)+ fibo1(n-2);
    }

    public static long fibo2(int n, long[] memo){
        if(n == 0) return 1;
        if(n == 1) return 2;
        if(memo[n] != 0) return memo[n];
        memo[n] = fibo2(n-1, memo) + fibo2(n-2, memo);

        return memo[n];
    }

    public static int fibo3(int n){
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 2;
        for (int i = 2;i<n;i++){
            a[i] = a[i-1] + a[i-2];
        }
        return a[n-1];
    }

    public static void main(String[] args) {
//        long[] memo = new long[46];
        System.out.println(fibo3(4));
//        System.out.prlongln(fibo1(20));
    }
}

