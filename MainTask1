import java.util.Scanner;

public class MainTask {
    //enter integer
    public static int enterInt() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        int number = in.nextInt();
        return number;
    }

    //enter double
    public static double enterDouble() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double number = in.nextDouble();
        return number;
    }

    //task1
    public static void compareNumbers(double a, double b, double c) {
        if (a == b && b == c) System.out.println("Numbers are equal");
        else System.out.println("Numbers are not equal");
    }

    //task2
    public static void convertDinosaurWeight(double weight) {
        if (weight <= 0) {
            System.out.println("Illegal value");
            return;
        }
        double miligrams = weight * 1000000;
        double grams = weight * 1000;
        double tons = weight / 1000;
        System.out.println("Weight in miligrams: " + miligrams);
        System.out.println("Weigth in grams: " + grams);
        System.out.println("Weight in tons: " + tons);
    }

    //task3
    public static void calculateRingArea(double R1, double R2) {
        if (R1 < R2 || R2 <= 0) {
            System.out.println("Illegal value");
            return;
        }
        double ringArea = 3.14159265359 * (R1 * R1 - R2 * R2);
        System.out.printf("Ring area %.4f \n", ringArea);
    }

    //task4
    public static void checkForSequence(int number) {
        if (number < 1000 || number > 9999) {
            System.out.println("Illegal value");
            return;
        }
        int firstDigit = number / 1000;
        int secondDigit = (number / 100) % 10;
        int thirdDigit = (number / 10) % 10;
        int fourthDigit = number % 10;
        if (firstDigit > secondDigit)
            if (secondDigit > thirdDigit)
                if (thirdDigit > fourthDigit) {
                    System.out.println("Digits form a decreasing sequence");
                    return;
                }
        if (firstDigit < secondDigit)
            if (secondDigit < thirdDigit)
                if (thirdDigit < fourthDigit) {
                    System.out.println("Digits form an increasing sequence");
                    return;
                }
        System.out.println("Digits are not form increasing or decreasing sequence");
    }

    //task5
    public static void countMeansOfDigits(int number) {
        if (number < 100000 || number > 999999) {
            System.out.println("Illegal value");
            return;
        }
        double arithmeticalMean = ((double) (number % 10 + number / 10 % 10 +
                number / 100 % 10 + number / 1000 % 10 + number / 10000 % 10 + number / 100000)) / 6;
        System.out.println("Arithmetical mean:" + arithmeticalMean);
        double geometricalMean = Math.pow((double) ((number % 10) * (number / 10 % 10) *
                (number / 100 % 10) * (number / 1000 % 10) * (number / 10000 % 10) * (number / 100000)), 1.0 / 6);
        System.out.println("Geometrical mean:" + geometricalMean);
    }

    //task6
    public static void reverseNumber(int number) {
        if (number < 1000000 || number > 9999999) {
            System.out.println("Illegal value");
            return;
        }
        int resultNumber = number / 1000000 +
                (number / 100000) % 10 * 10 +
                (number / 10000) % 10 * 100 +
                (number / 1000) % 10 * 1000 +
                (number / 100) % 10 * 10000 +
                (number / 10) % 10 * 100000 +
                (number) % 10 * 1000000;
        System.out.println("Result number: " + resultNumber);
    }

    //task7
    public static void swapValues(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("First number:" + a + "\nSecond number:" + b);
    }

    public static void main(String args[]) {
        //task1
        System.out.println("Enter numbers to comparing");
        double a = enterDouble();
        double b = enterDouble();
        double c = enterDouble();
        System.out.println("Comparing numbers...");
        compareNumbers(a, b, c);
        //task2
        System.out.println("Enter dinosaur weight...");
        double weight = enterDouble();
        System.out.println("Converting weight...");
        convertDinosaurWeight(weight);
        //task3
        System.out.println("Enter R1 and R2(R1>R2)");
        double R1 = enterDouble();
        double R2 = enterDouble();
        System.out.println("Calculating ring area...");
        calculateRingArea(R1, R2);
        //task4
        System.out.println("Enter four digit number");
        int number1 = enterInt();
        System.out.println("Searching sequence...");
        checkForSequence(number1);
        //task5
        System.out.println("Enter seven digit number");
        int number2 = enterInt();
        System.out.println("Reversing number...");
        reverseNumber(number2);
        //task6
        System.out.println("Enter six digit number");
        int number3 = enterInt();
        System.out.println("Calculating means...");
        countMeansOfDigits(number3);
        //task7
        System.out.println("Enter numbers to swap");
        int d = enterInt();
        int e = enterInt();
        System.out.println("Swapping numbers...");
        swapValues(d, e);
    }
}
