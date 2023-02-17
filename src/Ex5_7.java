import java.util.Scanner;

public class Ex5_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение a: ");
        int a = scanner.nextInt();

        System.out.print("Введите значение b: ");
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println("Сумма натуральных чисел в диапазоне от " + a + " до " + b + " равна " + sum);
    }
}


