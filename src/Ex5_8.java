import java.util.Scanner;

public class Ex5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите зарплату сотрудника: ");
        double salary = sc.nextDouble();

        System.out.print("Введите класс сотрудника (A, B или C): ");
        String employeeClass = sc.next();

        double bonus = 0.0;

        switch (employeeClass) {
            case "A":
                bonus = salary * 0.5;
                break;
            case "B":
                bonus = salary * 0.25;
                break;
            case "C":
                bonus = 0.0;
                break;
            default:
                System.out.println("Некорректный класс сотрудника.");
                return;
        }

        double totalSalary = salary + bonus;

        System.out.println("Зарплата сотрудника с учетом премии: " + totalSalary);
    }
}

