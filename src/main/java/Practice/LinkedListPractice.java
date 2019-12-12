package Practice;


public class LinkedListPractice {
    public Node insert(int data, Node head){
        Node node = new Node(data,null);
        if(head != null){
            node = head.next;
        }
        return node;
    }
}

class Node {
    int data;
    Node next;
    public Node(int data, Node next){
        this.data = data;
        this.next = null;
    }
}