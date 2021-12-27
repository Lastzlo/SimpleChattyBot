import java.util.Scanner;

class Main {

    static final int SUM = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean result = number1 + number2 == SUM
                || number1 + number3 == SUM
                || number2 + number3 == SUM;
        System.out.println(result);
    }
}
