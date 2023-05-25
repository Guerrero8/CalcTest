import java.util.Scanner;

public class NumberCreation {
    Scanner scanner = new Scanner(System.in);

    public int enterNumber() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public String enterOperation() {
        String operation = scanner.nextLine();
        return operation;
    }
}