public interface Stackable {
    boolean isStackIsEmpty();
    boolean isStackIsFull();
    void putElementOnTheStack(int element);
    int getElementOnTheStack();
    int readElementOnTheTop();
}
