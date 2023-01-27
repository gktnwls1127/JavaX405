package day0118;

public class StackMain {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        stack.push(8);

        stack.printStack();
        System.out.println();
        System.out.println(stack.peek());
        stack.pop();
        stack.push(7);
        stack.printStack();


    }
}