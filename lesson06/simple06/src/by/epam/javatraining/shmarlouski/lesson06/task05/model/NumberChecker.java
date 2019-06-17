package by.epam.javatraining.shmarlouski.lesson06.task05.model;

public class NumberChecker {

    public static boolean isPrimeNumber(int number) {
        boolean answer = true;
        //1 and 0 are not prime numbers
        if (number <= 1) {
            answer = false;
        }
        // if number is even and don't 2 at the same time then it's not a prime number
        if (number % 2 == 0 && number != 2) {
            return false;
        }
        for (int i = 3; i < number / 2; i++) {
            System.out.println(number);
            if (number % i == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
