
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberSummation num = new NumberSummation();
        Scanner scanner = new Scanner(System.in);
        NumberCreation creation = new NumberCreation();
        int number1;
        int number2;
        String operation;
        String exit;
        while (true) {
            System.out.print("Введите число: ");
            number1 = creation.enterNumber();
            System.out.print("Введите операцию: ");
            operation = creation.enterOperation();
            System.out.print("Введите число: ");
            number2 = creation.enterNumber();
            switch (operation) {
                case "+":
                    num.summation(number1, number2);
                    break;
                case "-":
                    num.deduction(number1, number2);
                    break;
                case "/":
                    num.separate(number1, number2);
                    break;
                case "*":
                    num.multiply(number1, number2);
                    break;
                default:
                    System.out.println("ошибка.");
            }
            System.out.println("Введите 'exit', чтобы выйти, или нажмите Enter, чтобы продолжить.");
            exit = scanner.nextLine();
            if (exit.equals("exit")) {
                break;
            }
        }
    }
}