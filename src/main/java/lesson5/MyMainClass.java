package lesson5;

public class MyMainClass {
    public static void main(String[] args) {
        String myName = "My name is Pavel.Hello!";
        printBeautifully (myName, '$');
        printBeautifully ("New Name", '#');

    }

    public static void printBeautifully(String somethingToDisplay, char symbol){
        System.out.println(symbol + "   " +symbol);
        System.out.println("somethingToDisplay");
        System.out.println(symbol + "   " +symbol);
    }
}
