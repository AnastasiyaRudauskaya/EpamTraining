public class MainTask {
    //task1
    public static void isTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        double a = Math.sqrt((y2 - y1) * (y2 - y1) + (x1 - x2) * (x1 - x2));
        double b = Math.sqrt((y3 - y1) * (y3 - y1) + (x1 - x3) * (x1 - x3));
        double c = Math.sqrt((y2 - y3) * (y2 - y3) + (x3 - x2) * (x3 - x2));
        if (a >= (b + c) || b >= (a + c) || c >= (a + b))
            System.out.println("It is not triangle.");
        else if (a == Math.sqrt(b * b + c * c) || b == Math.sqrt(c * c + a * a) || c == Math.sqrt(b * b + a * a))
            System.out.println("It is right triangle.");
        else System.out.println("It is triangle.");
    }

    //task2
    public static void countHeadsAndEyes(int age) {
        int heads = 3;
        if (age < 0) {
            System.out.println("Invalid value.");
            return;
        }
        if (age <= 200) heads = 3 + age * 3;
        else if (age <= 300) heads = 603 + (age - 200) * 2;
        else if (age > 300) heads = 803 + (age - 300);
        System.out.println("Dragon at the age of " + age + " has " + heads + " and " + (heads * 2) + " eyes.");
    }

    //task3
    public static void isVowel(char letter) {
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("'" + letter + "' is a vowel.");
                break;
            default:
                System.out.println("'" + letter + "' isn't a vowel.");
                break;
        }
    }

    //task4
    public static void searchNextDate(int day, int month, int year) {
        System.out.println("Entered day is " + day + "." + month + "." + year);
        int maxDay;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;
            case 2: {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) maxDay = 29;
                else maxDay = 28;
                break;
            }
            default:
                System.out.println("Invalid input.");
                return;
        }
        if (day > maxDay) {
            System.out.println("Invalid input.");
            return;
        }
        day++;
        if (day > maxDay) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        System.out.println("The next day is " + day + "." + month + "." + year);

    }

    public static void main(String args[]) {
        isTriangle(2, 2, 5, 2, 5, 8);
        isTriangle(1, 1, 2, 2, 3, 3);
        countHeadsAndEyes(12);
        countHeadsAndEyes(455);
        isVowel('u');
        searchNextDate(28, 2, 2100);
    }
}
