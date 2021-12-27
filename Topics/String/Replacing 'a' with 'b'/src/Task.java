import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner
                    .next()
                    .replace('a', 'b');
            System.out.println(line);
        }
    }
}
