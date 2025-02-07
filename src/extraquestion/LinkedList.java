package extraquestion;

public class LinkedList {
     public class Node{
         private int data;
        Node next;

        public Node(int data){
             this.data = data;
             this.next = null;
         }
     }
     private Node head;
     public LinkedList(){
         head = null;
     }
     public void add(int data){
         Node newNode = new Node(data);
         if(head == null){
             head = newNode;
             return;
         }
         Node temp = head;
         while (temp.next!=null){
             temp = temp.next;
         }
         temp.next = newNode;
     }
     public void display(){
         Node temp = head;
         while (temp != null){
             System.out.println("Data = "+ temp.data);
             temp = temp.next;
         }
     }
}
