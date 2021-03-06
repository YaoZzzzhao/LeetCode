package LeetCode;

import java.util.Stack;

/**  Baseball Game
 * You're now a baseball game point recorder.
 *
 * Given a list of strings, each string can be one of the 4 following types:
 *
 * Integer (one round's score): Directly represents the number of points you get in this round.
 * "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
 * "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
 * "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
 * Each round's operation is permanent and could have an impact on the round before and the round after.
 *
 * You need to return the sum of the points you could get in all the rounds.
 */

public class LeetCode682 {
    public int calPoints(String[] ops) {
        Stack score = new Stack();
        int totalSum = 0;
        for(int i = 0;i<ops.length;i++){
            if(ops[i].equals("C")){
                int s = (int)score.pop();
                totalSum = totalSum - s;
            }else if(ops[i].equals("D")){
                int s = (int)score.peek();
                score.push(2*s);
                totalSum = totalSum + 2*s;
            }else if(ops[i].equals("+")){
                int s =(int)score.pop();
                int t =(int)score.peek();
                int sum = s+t;
                score.push(s);
                score.push(sum);
                totalSum = totalSum + sum;
            }else{
                int num = Integer.parseInt(ops[i]);
                score.push(num);
                totalSum = totalSum + num;
            }
        }
        return totalSum;
    }
}
