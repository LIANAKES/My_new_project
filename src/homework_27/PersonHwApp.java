package homework_27;

public class PersonHwApp {

    public static void main(String[] args) {
        Person_HW person = new Person_HW("email", "password");
        System.out.println(person);

        person.setEmail("test@mail.com");
        System.out.println(person.getEmail());

        person.setEmail("a1@email.de");
        System.out.println(person.getEmail());

        System.out.println("=========================");

        person.setEmail("a1@ema@il.de");
        person.setEmail("a1@email.d.e");
        person.setEmail("a1@emailde");
        person.setEmail("a1email.de");
        System.out.println(person.getEmail());

        System.out.println("============================");
        person.setPassword("cQ1%dfa"); //
        person.setPassword("cQ1%dfa_"); //
        System.out.println("==============================");
        person.setPassword("cQ1%dfar"); //
        person.setPassword("cQ1%dfa?"); //
        System.out.println(person.getPassword());

        /*
        // Полезные методы класса Character
        // Возвращает true если символ буква
        Character.isAlphabetic('c');
        // Возвращает true если символ цифра
        Character.isDigit('1');
        Character.isLetter('3');
        Character.isLetterOrDigit('-');
         */


    }
}

