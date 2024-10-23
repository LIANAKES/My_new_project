package lesson_28.equals;

import lists.MyArrayList;
import lists.MyList;

public class EmployeeApp {
    public static void main(String[] args) {

        MyList<Employee> employees = new MyArrayList<>();

        Employee employee = new Employee("Petr", "Petrov", "21.10.2000");
        Employee employee1 = new Employee("Ivan", "Ivanov", "05.12.1998");
        Employee employee2 = new Employee("Ivan", "Ivanov", "15.01.2001");
        Employee employee3 = new Employee("Ivan", "Ivanov", "15.01.2001");

        System.out.println(employee == employee1);
        System.out.println("employee == employee1: " + (employee == employee1));

        System.out.println("employee2.equals(employee3): " + (employee2.equals(employee3)));

        System.out.println("employee1.equals(employee2): " + (employee1.equals(employee2)));
    }
}
