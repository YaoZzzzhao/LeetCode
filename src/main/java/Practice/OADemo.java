package Practice;

public class OADemo {
        public static int solution(int[] A) {
            // write your code in Java SE 8
            int l = A.length;
            boolean[] temp = new boolean[l];

//            boolean[] temp = new boolean[100000];
//            if(A[0]>1) return 1;
//            if(A[.length-1]<1) return 1;

            for(int i = 0;i<l;i++){
                if(A[i]<=0 || A[i]>l)
                    continue;
                else if(temp[A[i]-1]==false){
                    temp[A[i]-1] = true;
                }
            }
            for(int i =1;i<=l;i++){
                if(temp[i-1]==false)
                    return i;
            }
            return l+1;
        }

    public static void main(String[] args) {
        int[] A = {1,2,5,4,6};
        System.out.println(solution(A));
    }
}
