import java.util.Scanner;
import java.util.Stack;

class Main {

    static final int REPEAT_TIMES = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < REPEAT_TIMES; i++) {
            stack.push(scanner.next());
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
