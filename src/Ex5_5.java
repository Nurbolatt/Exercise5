import java.util.Scanner;

public class Ex5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите цифру: ");
        int number = sc.nextInt();
        boolean isPrime = true;


        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " является простым числом");
        } else {
            System.out.println(number + " не является простым числом");
        }
    }
}
