package day0118;

public interface Stack {
    public boolean isEmpty();
    public boolean isFull();
    public void push(int element);
    public int pop();
    public int peek();
    public int search(int element);
    public void clear();
}