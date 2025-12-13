package gr.aueb.cf.cf9.part1pop.ch6;

/**
 * Demonstrates a Stack data structure based on an array.
 * A Stack follows the LIFO (Last-In, First-Out) principle.
 * Operations:
 * Push: Adds an element to the top.
 * Pop: Removes and returns the top element.
 */
public class StackApp {

    // The stack array and the top pointer are static (global for this class)
    static int[] stack = new int[10];
    static int top = -1; // -1 indicates that the stack is empty

    public static void main(String[] args) {
        // Push elements
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6); // top is now at index 5 (value 6)

        System.out.println("Current Stack: ");
        printStack();

        // Pop an element
        int popped = pop();
        System.out.println("\nPopped element: " + popped);

        System.out.println("\nStack After Pop: ");
        printStack();
    }

    /**
     * Adds an element to the top of the stack.
     * @param num the integer to add
     */
    public static void push(int num) {
        if (isFull()) {
            System.out.println("Stack is FULL! Cannot push: " + num);
            return;
        }

        // Increment top, then store the value
        stack[++top] = num;

        // top++;
        // stack[top] = num;
    }

    /**
     * Removes and returns the top element of the stack.
     * @return the top integer
     * @throws RuntimeException if the stack is empty
     */
    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow (Empty Stack)");
        }

        // Return value, then decrement top
        return stack[top--];

        // int num = stack[top];
        // top--;
        // return num;
    }

    /**
     * Checks if the stack is empty.
     * @return true if top is -1
     */
    public static boolean isEmpty() {
        return top == -1;
    }

    /**
     * Checks if the stack is full.
     * @return true if top reached the last index
     */
    public static boolean isFull() {
        return top == stack.length - 1;
    }

    /**
     * Prints the stack elements from Top to Bottom.
     */
    public static void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
