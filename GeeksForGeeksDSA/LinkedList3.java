//package GeeksForGeeksDSA;
//
//public class LinkedList3 {
//
//    static class Node{
//        int data;
//        Node next;
//    }
//    static Node newNode(int data){
//        Node new_node = new Node();
//        new_node.data = data;
//        new_node.next = null;
//        return new_node;
//    }
//    static Node insertEnd(Node head, int data){
//        if(head==null)
//            return newNode(data);
//        else
//            head.next = insertEnd(head.next, data);
//        return head;
//    }
//    static void traverse(Node head){
//        if(head==null)
//            return;
//        System.out.println(head.next+" ");
//        traverse(head.next);
//    }
//
//    public static void main(String[] args) {
//        Node head = null;
//        head = insertEnd(head, 6);
//        head = insertEnd(head, 8);
//        head = insertEnd(head, 10);
//        head = insertEnd(head, 12);
//        head = insertEnd(head, 14);
//        traverse(head);
//    }
//
//
//}
