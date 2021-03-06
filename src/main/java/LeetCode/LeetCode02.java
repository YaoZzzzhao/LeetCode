package LeetCode;

/**   WORTH REDOING
 * You are given two non-empty linked lists representing two
 * non-negative integers. The digits are stored in reverse order
 * and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading
 * zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

public class LeetCode02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        int sum = 0;
        ListNode store = new ListNode(0);
        ListNode ans = store;
        while(c1.next != null || c2.next != null){
            sum = sum/10;
            if(c1.next != null){
                sum += c1.val;
                c1 = c1.next;
            }
            if(c2.next != null){
                sum += c2.val;
                c2 = c2.next;
            }
            store.next = new ListNode(sum % 10);
            store = store.next;
        }
        if(sum/10==1){
            store.next = new ListNode(1);
        }
        return ans.next;
    }
}
