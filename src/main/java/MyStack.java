import java.util.Arrays;

public class MyStack implements Stackable {

    private int mSize;
    private int[] stackArray;
    private int top;

    MyStack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }

    public boolean isStackIsEmpty() {
        return (top == -1);
    }

    public int getTop(){
        return top;
    }

    public boolean isStackIsFull() {
        return (top == mSize - 1);
    }


    public void putElementOnTheStack(int element) {
        try {
            stackArray[++top] = element;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The Stack is over");
        }

    }

    public int getElementOnTheStack() {
        try {
            return stackArray[top--];
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("stack is empty");
            return top;
        }
    }

    public int readElementOnTheTop() {
        System.out.print("The last Element of Stack: " + stackArray[top]);
        return stackArray[top];
    }
}
