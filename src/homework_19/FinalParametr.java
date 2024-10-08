package homework_19;

public class FinalParametr {
    public static void printMessage(final String message) {
        System.out.println("Message: " + message);

        // Попытка изменить значение параметра
        // message = "New message"; // Ошибка компиляции
    }

    /*
    Метод printMessage принимает параметр message, который объявлен с модификатором final.
    Это значит, что значение параметра не может быть изменено внутри метода.
   Если мы попробуем изменить значение message, например,  message = "New message";
   компилятор выдаст ошибку:
     */

    public static void main(String[] args) {
        printMessage("Hello, World!");

    }

}
