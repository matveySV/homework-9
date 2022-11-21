import java.util.Optional;

public interface Stackable {
    boolean isStackIsEmpty();
    boolean isStackIsFull();
    void addElementOnTheStack(int element);
    int deleteElementOnTheStack() throws isStackIsEmptyException;
    Optional<Integer> optionalreadElementOnTheTop();
}
