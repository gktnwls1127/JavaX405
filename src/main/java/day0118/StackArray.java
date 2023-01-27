package day0118;

public class StackArray{
    private int[] arr;
    private int top;
    private int size;

    public StackArray(int size){
        this.size = size;
        top = -1;
        arr = new int[this.size];
    }

    public boolean isEmpty() {
        return top == -1;
    }


    public boolean isFull() {
        return top == this.size - 1;
    }


    public void push(int element) {
        if (isFull()) {
            System.out.println("더이상 추가할수 없습니다.");
        } else {
            arr[++top] = element;
        }

    }


    public int pop() {
        if (isEmpty()){
            System.out.println("비어있는 스택입니다.");
            return 0;
        } else {
            return arr[top--];
        }
    }


    public int peek() {
        if (!isEmpty()){
            return arr[top];
        } else {
            System.out.println("비어있는 스택입니다.");
            return 0;
        }
    }


    public int search(int element) {
        for(int i =0; i <= top; i++){
            if (arr[i] == element){
                return i;
            }
        }
        return -1;
    }


    public void clear() {
        if (isEmpty()){
            System.out.println("비어있는 스택입니다.");
        } else {
            top = -1;
            arr = new int[this.size];
        }
    }

    public void printStack(){
        if (isEmpty()){
            System.out.println("비어있는 스택입니다.");
        } else {
            for (int i= 0; i <= top; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}