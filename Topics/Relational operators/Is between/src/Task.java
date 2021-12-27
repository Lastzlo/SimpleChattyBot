import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anInt1 = scanner.nextInt();
        int anInt2 = scanner.nextInt();
        int anInt3 = scanner.nextInt();

        System.out.println(anInt1 >= anInt2 ? anInt1 <= anInt3 : anInt1 >= anInt3);
    }
}
