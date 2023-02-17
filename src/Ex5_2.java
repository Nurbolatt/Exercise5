import java.util.Scanner;

public class Ex5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стоимость покупки: ");
        double cost = scanner.nextDouble();

        if (cost > 5000) {
            cost = cost * 0.9;
        }

        System.out.println("Итоговая стоимость покупки: " + cost);
    }
}