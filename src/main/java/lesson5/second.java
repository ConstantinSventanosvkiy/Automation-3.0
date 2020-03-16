package lesson5;

public class second {
    public static void main(String[] args) {
        String myString;
        myString = combineString("belka", "strelka", '-');
        printMyString(myString);


    }

    public static String combineString(String a, String b, char c) {
        String myCombinedString;
        myCombinedString = a + c + b;
        return myCombinedString;
    }


    public static void printMyString(String myString) {

        System.out.println(myString);

    }
}