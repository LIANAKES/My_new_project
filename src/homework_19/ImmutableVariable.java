package homework_19;

public class ImmutableVariable {
    public static final int MAX_USERS = 100;

    public static void main(String[] args) {
        System.out.println("Initial MAX_USERS: " + MAX_USERS);

        // Попробуем изменить значение MAX_USERS
        // MAX_USERS = 200; // Эта строка вызовет ошибку компиляции

        System.out.println("Modified MAX_USERS: " + MAX_USERS);

        /*
        Переменная, объявленная с модификатором final, становится неизменяемой .
        И может быть инициализирована только один раз, после этого значение не может быть изменено.
        Если  попытаться изменить значение переменной, объявленной как final, компилятор выдаст ошибку,
        так как нарушается основное правило неизменяемых переменных.
       Поэтому значение MAX_USERS = 100;становится константой, и попытка присвоить ей новое значение приведет к ошибке.
         */

    }

}
