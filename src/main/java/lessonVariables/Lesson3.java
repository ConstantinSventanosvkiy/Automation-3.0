package lessonVariables;

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //String firstReadFromConsole
        //String secondReadFromConsole

        System.out.print("Please enter the 1-st summand:");
                String stringIReadFromConsole = scanner.nextLine();
                Integer myConvertedString = Integer.parseInt(stringIReadFromConsole);
                System.out.println("i've just read from console: " + stringIReadFromConsole);
        System.out.print("Please enter the 2-nd summand:");
                String stringIReadFromConsole2 = scanner.nextLine();
                Integer myConvertedString2 = Integer.parseInt(stringIReadFromConsole2);
         Integer sum = myConvertedString + myConvertedString2;
        System.out.println("The sum is: " + sum);

        System.out.print("Please enter the minuend:");
        String stringIReadFromConsole3 = scanner.nextLine();
        Integer myConvertedString3 = Integer.parseInt(stringIReadFromConsole3);
        System.out.println("i've just read from console: " + stringIReadFromConsole3);
        System.out.print("Please enter the subtrahend:");
        String stringIReadFromConsole4 = scanner.nextLine();
        Integer myConvertedString4 = Integer.parseInt(stringIReadFromConsole4);
        System.out.println("i've just read from console: " + stringIReadFromConsole);

        Integer sub = myConvertedString3 - myConvertedString4;
        System.out.println("The difference  is: " + sub);

        //System.out.println("i've just read from console: " + stringIReadFromConsole + stringIReadFromConsole2);




    }
}