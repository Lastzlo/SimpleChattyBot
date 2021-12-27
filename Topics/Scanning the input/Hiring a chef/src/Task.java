import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String yearsOfExperience = scanner.nextLine();
        String cuisinePreference = scanner.nextLine();

        System.out.printf("The form for %s is completed. We will " +
                "contact you if we need a chef who cooks %s dishes " +
                "and has %s years of experience.",
                firstName, cuisinePreference, yearsOfExperience);
    }
}
