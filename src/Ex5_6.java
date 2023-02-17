public class Ex5_6 {
    public static void main(String[] args) {

        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");
        System.out.println("**********");

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows - i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
