package homework_45;


import lesson_45.validator.EmailValidateException;

public class ValidateApp {
    public static void main(String[] args) {
        try {
            EmailValidator.isEmailValid("test@gmail.com"); // Валидный email
        } catch (EmailValidateException e) {
            System.out.println(e.getMessage());
        }

        try {
            EmailValidator.isPasswordValid("StrongPass1!"); // Валидный пароль
        } catch (PasswordValidateException e) {
            System.out.println(e.getMessage());
        }

        try {
            EmailValidator.isEmailValid("invalid_email@com"); // Некорректный email
        } catch (EmailValidateException e) {
            System.out.println(e.getMessage());
        }

        try {
            EmailValidator.isPasswordValid("weak"); // Некорректный пароль
        } catch (PasswordValidateException e) {
            System.out.println(e.getMessage());
        }
    }
}

