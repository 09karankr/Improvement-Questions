package stackquestions;
import java.util.*;

public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return (head == null);
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) { // if ll is empty then the newNode will be directly made the head
                head = newNode;
                return;
            } // since in stack elements are added from top
            newNode.next = head; // the current head will be stored in the next of new node
            head = newNode; // new node will be declared as head
        }

        public static int pop() {
            if (isEmpty() == true)
                return -1;
            int top = head.data;
            head = head.next; // sinc ethe current head is popped, the new head will be the one stored in the
            // current head's next
            return top;
        }

        public static int peek() {
            if (isEmpty())
                return -1;
            return head.data;
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

