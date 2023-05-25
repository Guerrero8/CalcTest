public class NumberSummation {
    int result;

    public void summation(int number1, int number2) {
        result = number1 + number2;
        System.out.println(result);
    }

    public void deduction(int number1, int number2) {
        result = number1 - number2;
        System.out.println(result);
    }

    public void separate(int number1, int number2) {
        if (number2 == 0)
            System.out.println("На ноль делить нельзя");
        else
            result = number1 / number2;
        System.out.println(result);
    }

    public void multiply(int number1, int number2) {
        result = number1 * number2;
        System.out.println(result);
    }
}
