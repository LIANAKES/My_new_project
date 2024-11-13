package homework_45;

import lesson_45.validator.EmailValidateException;

public class EmailValidator {
    // Валидация email
    public static void isEmailValid(String email) throws EmailValidateException {

        // 1. Должна присутствовать @
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) {
            throw new EmailValidateException("@ error");
        }

        // 2. Точка после @
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) {
            throw new EmailValidateException(". after @ error");
        }

        // 3. После последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex + 2 >= email.length()) {
            throw new EmailValidateException("last . error");
        }

        // 4. Допустимые символы
        for (int i = 0; i < email.length(); i++) {
            char ch = email.charAt(i);
            boolean isPass = Character.isAlphabetic(ch) || Character.isDigit(ch) || ch == '-' || ch == '_' || ch == '.' || ch == '@';
            if (!isPass) {
                throw new EmailValidateException("illegal symbol");
            }
        }

        // 5. До @ должен быть хотя бы 1 символ
        if (indexAt == 0) {
            throw new EmailValidateException("@ should not be first");
        }

        // 6. Первый символ - буква
        char firstChar = email.charAt(0);
        if (!Character.isAlphabetic(firstChar)) {
            throw new EmailValidateException("first symbol should be alphabetic");
        }

        // Все проверки пройдены
        System.out.println("Email is valid.");
    }

    // Валидация пароля
    public static void isPasswordValid(String password) throws PasswordValidateException {
        if (password == null || password.length() < 8) {
            throw new PasswordValidateException("Password should be at least 8 characters");
        }

        boolean isDigit = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;
        boolean isSpecialSymbol = false;

        String symbols = "!%$@&*()[].,-";

        // Перебираем символы пароля
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) isDigit = true;
            if (Character.isUpperCase(ch)) isUpperCase = true;
            if (Character.isLowerCase(ch)) isLowerCase = true;
            if (symbols.indexOf(ch) >= 0) isSpecialSymbol = true;
        }

        // Если хотя бы одно из условий не выполнено
        if (!(isDigit && isUpperCase && isLowerCase && isSpecialSymbol)) {
            String message = String.format(
                    "Password validation failed: Digit: %s, Uppercase: %s, Lowercase: %s, Special symbol: %s",
                    isDigit, isUpperCase, isLowerCase, isSpecialSymbol
            );
            throw new PasswordValidateException(message);
        }

        System.out.println("Password is valid.");
    }
}


