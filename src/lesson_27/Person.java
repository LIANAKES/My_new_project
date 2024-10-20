package lesson_27;

public class Person {
    public String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)){
            this.email = email;
        }

    }



/*
    test@email.com.net
    1. Должна присутствовать @ и только одна - done
    2. Точка после собаки
    3. После последней точки есть 2 или более символов
    4. Aлфавит, цифры, символы '-', '_', '.', '@'
    5. До собаки должен быть хотя бы 1 символ
    6. Первый символ должна быть буква
     */

    private boolean isEmailValid(String email) {

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        // int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        // 2. Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // 3. После последней точки есть 2 или более символов
        if (email.length() - dotIndexAfterAt < 3) return false;

        // 4. Aлфавит, цифры, символы '-', '_', '.', '@'
        for (char c : email.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_' && c != '.' && c != '@') {
                return false;
            }
        }

        // 5. До собаки должен быть хотя бы 1 символ
        if (indexAt < 1) return false;

        // 6. Первый символ должна быть буква
        if (!Character.isLetter(email.charAt(0))) return false;



        // Полезные методы класса Character
        // Возвращает true если символ буква
        Character.isAlphabetic('c');
        // Возвращает true если символ цифра
        Character.isDigit('1');
        Character.isLetter('3');
        Character.isLetterOrDigit('-');



        return true;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private boolean isPasswordValid(String password) {

        // 1. Длина >= 8
        if (password.length() < 8) return false;

        // Логические переменные
        boolean hasDigit = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;

        // Множество допустимых специальных символов
        String specialChars = "!%$@&*()[].,-";

        // Проверяем каждый символ пароля
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (specialChars.indexOf(c) >= 0) {
                hasSpecialChar = true;
            }

            // Если все условия выполнены, можно прекратить проверку
            if (hasDigit && hasLowercase && hasUppercase && hasSpecialChar) {
                return true;
            }
        }

        // Пароль подходит, если все условия выполнены
        return hasDigit && hasLowercase && hasUppercase && hasSpecialChar;
    }

}

/*
Требования к паролю
длина >= 8
должна быть мин 1 цифра
должна быть мин 1 маленькая буква
должна быть мин 1 большая буква
должна быть мин 1 спец. символ (!%§@&*()[].,-)

5 boolean переменных. Каждая "отвечает за свой пункт"
Пароль будет подходить только если все пять - true
return b1 && b2 && b3 && b4 && b5;
 */

