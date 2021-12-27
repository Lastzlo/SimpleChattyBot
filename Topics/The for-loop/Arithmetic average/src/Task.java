import java.util.Scanner;

class Main {

    static final int DIVISIBLE_NUMBER = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        int count = 0;
        double sum = 0;

        for (int i = min; i <= max; i++) {
            if (i % DIVISIBLE_NUMBER == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println(sum / count);
    }
}
