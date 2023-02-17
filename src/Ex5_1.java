import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: ");
        double length = sc.nextDouble();

        System.out.print("Введите ширину прямоугольника: ");
        double width = sc.nextDouble();

        if (length == width) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Это прямоугольник");
        }
    }
}
