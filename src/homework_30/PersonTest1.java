package homework_30;

import lesson_30.persons.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class PersonTest1 {

    Person person;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";


    @BeforeEach
    void setUp(){
        person = new Person(startEmail, startPassword);
    }

    @Test
    void testValidPasswordSet(){
        String validPassword = "Valid1%.";

        person.setPassword(validPassword);
        System.out.println("getPassword: " + person.getPassword());

        Assertions.assertEquals(validPassword, person.getPassword());
    }


    @ParameterizedTest
    @MethodSource("InvalidPasswordData")
        void testInvalidPasswordSet (String invalidPassword){
            person.setPassword(invalidPassword);
            Assertions.assertNotEquals(invalidPassword, person.getPassword());
            Assertions.assertEquals(startPassword, person.getPassword());

        }
static Stream<String> InvalidPasswordData(){
        return Stream.of(
                "valid-R",
                "validpAs.",
                "val!-id",
                "inValid.",
                "valid1%",
                "_al2id."

        );
    }
    }

   /*
Требование к паролю:
1. длина >= 8
2. Должна быть мин 1 цифра
3. Должна быть мин 1 маленькая буква
4. Должна быть мин 1 большая буква
5. Должна быть мин 1 спец. символ (!%$@&*()[].,-)


  */

