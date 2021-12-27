import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfParts = scanner.nextInt();
        int perfectParts = 0;
        int smallerParts = 0;
        int largerParts = 0;

        for (int i = 0; i < numberOfParts; i++) {
            int typeOfPart = scanner.nextInt();

            if (typeOfPart == -1) {
                smallerParts++;
            } else if (typeOfPart == 0) {
                perfectParts++;
            } else {
                largerParts++;
            }

        }

        System.out.printf("%s %s %s", perfectParts, largerParts, smallerParts);
    }
}
