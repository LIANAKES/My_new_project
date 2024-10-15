package lesson_24.interfaces;

public class Application {
    public static void main(String[] args) {

        Book book = new Book(" Мастер и Маргарита", "М.Булгаков");

        // Object objBook = (Object) book;
       // System.out.println("ссылка типа object: " + objBook.toString());


        Journal journal = new Journal("Cosmopolitan", 154);
        Prntable printable = journal; // Неявное приведение типа ссылки
        printable.print();

        book.print();

        Prntable book1 = new Book("Философия Java", "Б. Эккель");
        book1.print();

        book.test();
        journal.test();

       Prntable.testStatic("Hello!");

        System.out.println("\n ==================== \n");

        Presentation presentation = new Presentation(
                "Inheritance",
                "Noname",
                "Inheritance in OOP",
                20);

        presentation.print();
        presentation.colorPrint();
        presentation.test();

       Prntable printable1 = presentation;
        printable1.print();


    }
}



