public class Main {
    public static void main(String[] args) {
        MyStack mStack = new MyStack(10);
        mStack.putElementOnTheStack(67);
        mStack.putElementOnTheStack(32);
        mStack.putElementOnTheStack(76);
        mStack.putElementOnTheStack(14);
        mStack.putElementOnTheStack(48);
        mStack.putElementOnTheStack(8);
        mStack.putElementOnTheStack(33);
        mStack.putElementOnTheStack(43);
        mStack.putElementOnTheStack(11);
        mStack.putElementOnTheStack(67);

        mStack.readElementOnTheTop();


        mStack.getElementOnTheStack();
        System.out.println();
        System.out.print("Stack: ");
        while (!mStack.isStackIsEmpty()) {
            int value = mStack.getElementOnTheStack();
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