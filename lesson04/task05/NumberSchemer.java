package lesson04.task05;

public class NumberSchemer {

    private static int firstNumber = 0;
    private static int secondNumber = 0;
    private static int thirdNumber = 0;
    private static int fourthNumber = 0;
    private static int fifthNumber = 0;
    private static int sixthNumber = 0;
    private static int seventhNumber = 0;

    public static void separateNumbers(int number) {
        seventhNumber = number % 10;
        number /= 10;
        sixthNumber = number % 10;
        number /= 10;
        fifthNumber = number % 10;
        number /= 10;
        fourthNumber = number % 10;
        number /= 10;
        thirdNumber = number % 10;
        number /= 10;
        secondNumber = number % 10;
        number /= 10;
        firstNumber = number % 10;
    }

    public static int reverseDigits() {
        return seventhNumber * 1000_000 + sixthNumber * 100_000 + fifthNumber * 10_000 + fourthNumber * 1_000
                + thirdNumber * 100 + secondNumber * 10 + firstNumber;
    }
}
