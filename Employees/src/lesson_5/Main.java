package lesson_5;

public class Main {

    public static void main(String[] args) {

        Employee[]employeesArray = new Employee[5];

        employeesArray[0] = new Employee("Иванов Петр Сергеевич", "Директор", "director@company.com",
                "+79111111111", 120000, 45);
        employeesArray[1] = new Employee("Сергеева Инна Олеговна", "Секретарь","secretary@company.com",
                "+79111111112", 30000, 22);
        employeesArray[2] = new Employee("Николаева Ирина Владимировна", "Бухгалтер", "accountant@company.com",
                "+79111111113", 80000, 50);
        employeesArray[3] = new Employee("Андреев Илья Михайловач", "Инженер", "it@company.com",
                "+79111111114", 65000, 30);
        employeesArray[4] = new Employee("Денисов Игорь Степанович", "Менеджер", "sales@company.com",
                "+79111111115", 60000, 35);

        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].AGE > 40) {
                employeesArray[i].printInfo();
            }
        }
        Forester forester = new Forester();
        forester.countArrNumbers();

    }



}
