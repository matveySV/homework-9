import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void ShouldReturnTrueIsStackIsEmpty() {
        MyStack stack = new MyStack(10);
        assertThat(stack.isStackIsEmpty()).isTrue();
    }

    @Test
    void shouldAddElementOnTheStack() {
        MyStack stack = new MyStack(3);
        stack.putElementOnTheStack(12);
        stack.putElementOnTheStack(12);
        assertThat(stack.isStackIsEmpty()).isFalse();
    }


    @Test
    void shouldCheckIsStackIsFull() {
        MyStack stack = new MyStack(2);
        stack.putElementOnTheStack(1);
        stack.putElementOnTheStack(2);
        assertThat(stack.isStackIsFull()).isTrue();
    }


    @Test
    void ShouldDeleteElementOnTheStack() {
        MyStack stack = new MyStack(5);
        stack.putElementOnTheStack(11);
        stack.putElementOnTheStack(22);
        stack.putElementOnTheStack(33);
        stack.putElementOnTheStack(45);
        assertThat(stack.getElementOnTheStack()).isEqualTo(45);
        assertThat(stack.getTop()).isEqualTo(2);
    }

    @Test
    void shouldReadElementOnTheTopOfStack() {
        MyStack stack = new MyStack(5);
        stack.putElementOnTheStack(11);
        stack.putElementOnTheStack(22);
        stack.putElementOnTheStack(33);
        assertThat(stack.readElementOnTheTop()).isEqualTo(33);

    }
}