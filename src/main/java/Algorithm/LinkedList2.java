package Algorithm;

import sun.awt.image.ImageWatched;

/**
 * Detect the loop of a LinkedList and find the merge point
 */

public class LinkedList2 {
    public static LinkedNode findMergePoint(LinkedNode ln){
        LinkedNode fastNode = ln.next.next;
        LinkedNode slowNode = ln.next;
        while(fastNode != slowNode){
            if(fastNode == null || fastNode.next == null) {
                return null;
            }
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        while(ln != slowNode){
            slowNode = slowNode.next;
            ln = ln.next;
        }
        return slowNode;
    }

    public static void main(String[] args){

        LinkedNode a1 = new LinkedNode(1);
        a1.next = new LinkedNode(2);
        LinkedNode a2 = a1.next;

        LinkedNode a3 = new LinkedNode(3);
        a2.next = a3;

        LinkedNode a4 = new LinkedNode(4);
        a3.next = a4;

//        a4.next = a2;

        System.out.println(findMergePoint(a1).value);
    }
}
