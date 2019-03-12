package lesson_5;

public class Employee {

    String FULL_NAME;
    String POSITION;
    String EMAIL;
    String PHONE;
    int SALARY;
    int AGE;

    Employee(String name, String position, String email, String phone, int salary, int age){

        FULL_NAME = name;
        POSITION = position;
        EMAIL = email;
        PHONE = phone;
        SALARY = salary;
        AGE = age;
    }

    void printInfo(){

        System.out.println();
        System.out.println("ФИО: " + FULL_NAME);
        System.out.println("Должность: " + POSITION);
        System.out.println("E-mail: " + EMAIL);
        System.out.println("Телефон: " + PHONE);
        System.out.println("Зарплата: " + SALARY + " руб.");
        System.out.println("Возраст: " + AGE + " лет");
        System.out.println();

    }


}
