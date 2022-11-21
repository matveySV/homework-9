import org.junit.jupiter.api.Test;


import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyStackTest {

    @Test
    void ShouldReturnTrueIsStackIsEmpty() {
        MyStack stack = new MyStack(10);
        assertThat(stack.isStackIsEmpty()).isTrue();
    }

    @Test
    void shouldAddElementOnTheStack() {
        MyStack stack = new MyStack(3);
        stack.addElementOnTheStack(12);
        stack.addElementOnTheStack(12);
        assertThat(stack.isStackIsEmpty()).isFalse();
    }

    @Test
    void shouldThrowExceptionWhenStackIsEmpty(){
        MyStack stack = new MyStack(3);
        assertThrows(isStackIsEmptyException.class, () -> stack.deleteElementOnTheStack());
    }
@Test
    void shouldThrowExceptionWhenStackIsFull(){
        MyStack stack = new MyStack(3);
        stack.addElementOnTheStack(11);
        stack.addElementOnTheStack(22);
       stack.addElementOnTheStack(33);
        assertThrows(isStackIsFullException.class, () -> stack.addElementOnTheStack(44));
    }



    @Test
    void shouldCheckIsStackIsFull() {
        MyStack stack = new MyStack(2);
        stack.addElementOnTheStack(1);
        stack.addElementOnTheStack(2);
        assertThat(stack.isStackIsFull()).isTrue();
    }


    @Test
    void ShouldDeleteElementOnTheStack() {
        MyStack stack = new MyStack(5);
        stack.addElementOnTheStack(11);
        stack.addElementOnTheStack(22);
        stack.addElementOnTheStack(33);
        stack.addElementOnTheStack(45);
        assertThat(stack.deleteElementOnTheStack()).isEqualTo(45);
        assertThat(stack.getTop()).isEqualTo(2);
    }

    @Test
    void shouldReadElementOnTheTopOfStack() {
        MyStack stack = new MyStack(5);
        stack.addElementOnTheStack(11);
        stack.addElementOnTheStack(22);
        stack.addElementOnTheStack(33);
        assertThat(stack.readElementOnTheTop()).isEqualTo(33);

    }

    @Test
    void shouldReadOptionalElementOnTheStack(){

        MyStack stack = new MyStack(5);
        stack.addElementOnTheStack(11);
        stack.addElementOnTheStack(22);
        stack.addElementOnTheStack(33);
        assertThat(stack.optionalreadElementOnTheTop()).isEqualTo(Optional.of(33));

    }
}