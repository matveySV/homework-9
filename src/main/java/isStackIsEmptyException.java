public class isStackIsEmptyException extends RuntimeException{
    isStackIsEmptyException(String message){
        super(message);
    }
}

 class isStackIsFullException extends RuntimeException{
    isStackIsFullException(String message){
        super(message);
    }
}


/*
Створити свої винятки для ситуації, коли стек заповнений і порожній
Кинути відповідні винятки у методах додавання/доставлення елемента зі стека
Протестувати що винятки кидаються
Написати метод діставання елемента, який повертає Optional
Протестувати цей метод ^^
 */