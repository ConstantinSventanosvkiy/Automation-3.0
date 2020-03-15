package Lesson6;

public class MyHomeTaskForLesson6 {
    public static int totalMinutesSpent = 0;

    public static void main(String[] args) {
        doHoovering();
        doMopping();
        doWindows();
        doDust();
        totalMinutesSpent();

    }

    public static void doHoovering() {
        int hoverTime = 20;
        int hover = totalMinutesSpent + hoverTime;
        System.out.println("I started cleaning the flat with the vacuum cleaner and it took " + hover + " minutes");
    }

    public static void doMopping() {
        int moppingTime = 15;
        int mopping = totalMinutesSpent + moppingTime ;
        System.out.println("Then i was mopping the floor for " + mopping + " minutes");
    }

    public static void doWindows() {
        int windowsTime = 10;
        int windows = totalMinutesSpent + windowsTime;
        System.out.println("After that i did the windows, that was for " + windows + " minutes");
    }

    public static void doDust() {
        int dustTime = 5;
        int dusting = totalMinutesSpent + dustTime;
        System.out.println("And finally i dusted the furniture for " + dusting + " minutes");
    }

    public static void totalMinutesSpent(){
        int totalMinutesSpent = 20 + 15 +10 +5;
        System.out.println("Totally i spent " + totalMinutesSpent + " minutes on the household chores");
    }


}
