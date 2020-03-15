package MyHomeTaskLesson5;

import java.util.Scanner;

public class MyHomeTaskLesson5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int numberFirst = scanner.nextInt();
        System.out.print("Type another number: ");
        int numberSecond = scanner.nextInt();
        outputResultToConsole(numberFirst, numberSecond);
    }

    public static void outputResultToConsole(int numberFirst, int numberSecond) {
        System.out.println("вы сложили число " + numberFirst + " и число " + numberSecond + ", сумма равна " +
                plus(numberFirst, numberSecond)
        );
        System.out.println("вы вычли из числа " + numberFirst + " число " + numberSecond + ", разница равна " +
                minus(numberFirst, numberSecond)
        );
    }

    public static int plus(int numberFirst, int numberSecond) {
        return numberFirst + numberSecond;
    }

    public static int minus(int numberFirst, int numberSecond)
    {
        return numberFirst - numberSecond;
    }
}

