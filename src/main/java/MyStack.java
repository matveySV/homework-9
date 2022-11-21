import java.util.Optional;

public class MyStack implements Stackable {

    private int mSize;
    private int[] stackArray;
    private int top;

    MyStack(int capacity) {
        this.mSize = capacity;
        stackArray = new int[mSize];
        top = -1;
    }

    public boolean isStackIsEmpty() {
        return (top == -1);
    }

    public int getTop() {
        return top;
    }

    public boolean isStackIsFull() {
        return (top == mSize - 1);
    }


    public void addElementOnTheStack(int element) {
        if (isStackIsFull()) throw new isStackIsFullException("The Stack is full");
        stackArray[++top] = element;
    }

    public int deleteElementOnTheStack() { //pop
        if(isStackIsEmpty()) throw new isStackIsEmptyException("stack is empty");
        return stackArray[top--];

    }

    public int readElementOnTheTop() { //peek
        System.out.print("The last Element of Stack: " + stackArray[top]);
        return stackArray[top];
    }

    public Optional<Integer> optionalreadElementOnTheTop(){
        if(isStackIsEmpty()){
            return Optional.empty();
        }
        return Optional.of(stackArray[top]);
    }
}
