import java.util.Scanner;

class Main {

    static final int MAX_CAPS = 20;
    static final int MIN_CAPS = 10;

    static final int MAX_CAPS_ON_WEEKEND = 25;
    static final int MIN_CAPS_ON_WEEKEND = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        System.out.println(isWeekend
                                ? numberOfCups >= MIN_CAPS_ON_WEEKEND && numberOfCups <= MAX_CAPS_ON_WEEKEND
                                : numberOfCups >= MIN_CAPS && numberOfCups <= MAX_CAPS);

    }
}
