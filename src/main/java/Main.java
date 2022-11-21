public class Main {
    public static void main(String[] args) throws isStackIsEmptyException {
        MyStack mStack = new MyStack(10);
        mStack.addElementOnTheStack(67);
        mStack.addElementOnTheStack(32);
        mStack.addElementOnTheStack(76);
        mStack.addElementOnTheStack(14);
        mStack.addElementOnTheStack(48);
        mStack.addElementOnTheStack(8);
        mStack.addElementOnTheStack(33);
        mStack.addElementOnTheStack(43);
        mStack.addElementOnTheStack(11);
        mStack.addElementOnTheStack(67);

        mStack.readElementOnTheTop();
        System.out.println();

        System.out.println("The last Element of Stack: " + mStack.optionalreadElementOnTheTop().toString());

        mStack.deleteElementOnTheStack();
        System.out.println();
        System.out.print("Stack: ");
        while (!mStack.isStackIsEmpty()) {
            int value = mStack.deleteElementOnTheStack();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
    }
}
/*
Написати клас MyStack – власна реалізація стеку.
1. MyStack має імплементувати інтерфейс Stackable (теж створити самому).
2. У інтерфейсу Stackable мають бути такі методи
       - чи порожній стек?
       - Чи повний стек?
       - покласти елемент у стек
       - дістати елемент зі стека
       - Подивитися верхній елемент стека
 */