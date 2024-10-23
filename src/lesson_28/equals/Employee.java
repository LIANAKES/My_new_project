package lesson_28.equals;

import lists.MyArrayList;
import lists.MyList;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee (String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
       if (this == obj) return  true; // Ссылки ссылаются на один и тот же обьект
       if (!(obj instanceof Employee)) return false; //Проверка на возможность привести к Employee
        Employee employee = (Employee) obj;

        // При таком сравнение возможно появление NPE
        // firstName.equals(employee.firstName);
        // null.equals(employee.firstName); -> аварийное завершение программы
        // Objects.equals(null, employee.firstName) -> просто вернет false


        // При сравнении любого обькта с null должно возвращаться false

        // Безопасное сравнение обьектов, учитывая возможность null значений
        return Objects.equals(firstName, employee.firstName) &&
               Objects.equals(lastName, employee.lastName) &&
               Objects.equals(dateOfBirth, employee.dateOfBirth);

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}


