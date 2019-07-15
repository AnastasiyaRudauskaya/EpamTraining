import java.util.Random;

public class MainTask {
    /*
    возвращает количество выпадений орла из 1000 бросков
    */
    public static int toTossACoin() {
        Random random = new Random();
        int heads = 0;
        int coin; //heads - 0; tails - 1;

        for (int i = 0; i < 1000; i++) {
            coin = random.nextInt(2);
            if (coin == 0) {
                heads++;
            }
        }
        return heads;
    }
    
    /*
    находит наибольшую цифру
     */
    public static int toFindLagerDigit(int number) {
        int max = number % 10;

        number /= 10;
        while (number > 0) {
            if (number % 10 > max) {
                max = number % 10;
            }
            number /= 10;
        }
        return max;
    }
    
    /*
    проверяет, является ли число палиндромом
     */
    public static boolean isPalindrome(int number) {
        int tempNumber = number;    //for creation of reverse
        int reverse = 0;

        while (tempNumber != 0) {
            reverse = reverse * 10 + tempNumber % 10;
            tempNumber = tempNumber / 10;
        }

        if (number == reverse) {
            return true;
        } else return false;
    }

    /*
    проверяет простое ли число
     */
    public static boolean isPrime(int number) {
        if (number == 1) return false;
        if (number == 2) return true;
        double sqrtNumber = Math.sqrt(number);
        for (int i = 2; i < sqrtNumber + 1; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    /*
    выводит на экран все простые делители числа
     */
    public static void findPrimeDivisors(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
        }
    }

    /*
    возвращает НОД двух натуральных чисел
     */
    public static int findGCD(int number1, int number2) {
        int divisor = 1;

        for (int i = 1; i < number1 + 1 && i < number2 + 1; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                divisor = i;
            }
        }
        return divisor;
    }

    /*
    возвращает НОК двух натуральных чисел
     */
    public static int findLCM(int number1, int number2) {
        return number1 * number2 / findGCD(number1, number2);
    }

    /*
    проверяет совершенное ли число
     */
    public static boolean isPerfectNumber(int number) {
        int sum = countSumOfOwnDividers(number);
        if (sum == number) {
            return true;
        } else return false;
    }

    /*
    возвращает сумму собственных делителей
     */
    public static int countSumOfOwnDividers(int number) {
        int sum = 0;

        double halfNumber = number / 2;
        for (int i = 1; i < halfNumber + 1; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /*
    проверяет дружественные ли числа
     */
    public static boolean isFriendlyNumbers(int number1, int number2) {
        if (countSumOfOwnDividers(number1) == number2 && countSumOfOwnDividers(number2) == number1) {
            return true;
        } else return false;
    }


    public static void main(String args[]) {
        //task1
        int heads = toTossACoin();
        System.out.println("Toss coin 1000 times...\nThere are " + heads + " heads and " + (1000 - heads) + " tails");

        //task2a
        int num = 34985;
        System.out.println("The lager digit of " + num + " is " + toFindLagerDigit(num));

        //task2b
        int palindromeNumber = 123321;
        System.out.println(palindromeNumber + " is palindrome. It is " + isPalindrome(palindromeNumber));

        //task2c
        int primeNumber = 12;
        System.out.println(primeNumber + " is prime. It is " + isPrime(primeNumber));

        //task2d
        int number = 231;
        System.out.println("The number is " + number + " Its prime divisors are: ");
        findPrimeDivisors(number);

        //task2ef
        int number1 = 34;
        int number2 = 68;
        System.out.println("\n" + number1 + " and " + number2 + ". Their GCD is " + findGCD(number1, number2)
                + ", their LCM is " + findLCM(number1, number2));

        //task3
        int perfectNumber = 8128;
        System.out.println(perfectNumber + " is perfect number. It is " + isPerfectNumber(perfectNumber));

        //task4
        int friendlyNumber1 = 220;
        int friendlyNumber2 = 284;
        System.out.println("Numbers " + friendlyNumber1 + " and " + friendlyNumber2 + " are friendly. It is " + isFriendlyNumbers(220, 284));
    }
}
