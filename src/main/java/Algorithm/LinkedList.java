package Algorithm;

/**
 * Calculate the length of LinkedList
 */


public class LinkedList {
    public static int length(LinkedNode ln){
        int count =1;
        while(ln.next!=null){
            count ++;
            ln = ln.next;
        }
        return count;
    }

    public static void main(String[] args){
        LinkedNode a1 = new LinkedNode(1);
        a1.next = new LinkedNode(3);
        LinkedNode a2 = a1.next;

        a2.next = new LinkedNode(4);
        LinkedNode a3 = a2.next;

        a3.next = new LinkedNode(5);
        LinkedNode a4 = a3.next;

        a4.next = new LinkedNode(6);
        LinkedNode a5 = a4.next;

//        Algorithm al = new Algorithm();
        System.out.println(length(a1));
    }
}

class LinkedNode{
    int value;
    LinkedNode next;

    LinkedNode(int i){
        this.value = i;
    }

    String toString(LinkedNode ln){
        return Integer.toString(ln.value);
    }
}
