package stackquestions;

public class StackUsingArray {
    int n;
    int arr[];  // Array to store the elements of the stack
    int top;  //Indedx of the top element of the stack

    StackUsingArray(int n){
        this.n = n;
        this.arr = new int[n];
        this.top = -1;  // The stack is initially empty, so top is set to -1
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public boolean isFull(){
        return (n-1 == top);
    }

    // Pushes an element onto the top of the stack
    public void push(int pushedElement){
        if(!isFull()){
            top++;
            arr[top] = pushedElement;
            System.out.println("Pushed element: " +  pushedElement);
        } else {
            System.out.println("Stack is full !"); // Overflow
        }
    }

    // Removes and returns the element at the top of the stack
    public int pop(){
        if (!isEmpty()){
            int poppedElement = top;
            top--;
            System.out.println("Popped element: " + arr[poppedElement]);
            return arr[poppedElement];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    // Returns the element at the top of the stack without removing it
    public int peek(){
        if(!isEmpty()){
            return arr[top];
        } else{
            System.out.println("Stack is Empty");
            return -1;
        }
    }
    public static void main(String[] args){
        StackUsingArray Stack = new StackUsingArray(101); // Create a new stack with a size of 101
        Stack.pop();

        Stack.push(1);
        Stack.push(2);
        Stack.push(3);

        Stack.pop();
        Stack.pop();
        Stack.pop();
    }
}
