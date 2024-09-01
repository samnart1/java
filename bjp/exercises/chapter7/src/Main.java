import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // take input and store it in an array.
        // find the average
        // find days that are lower than the average
        // and days higher than the average

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days' temperatures? ");
        int numDays = scanner.nextInt();
        int[] days = new int[numDays];
        int sum = 0;

        for (int i = 0; i < numDays; i++) {
            int next = scanner.nextInt();
            days[i] = next;
            sum += next;
        }

        double average = (double) sum / numDays;

        for (int i = 0; i < days.length; i++) {
            if (days[i] > average) {
                System.out.println("Day " + (i + 1) + "'s high temp is higher than the average.");
            } else {
                System.out.println("Day " + (i + 1) + "'s high temp is lower than the average.");
            }
        }

        scanner.close();
    }






















//    public static void main(String[] args) {
//        int[] dayIn = new int[12];
//        dayIn[0] = 31;
//        dayIn[1] = 28;
//        dayIn[2] = 31;
//        dayIn[3] = 30;
//        dayIn[4] = 31;
//        dayIn[5] = 30;
//        dayIn[6] = 31;
//        dayIn[7] = 31;
//        dayIn[8] = 30;
//        dayIn[9] = 31;
//        dayIn[10] = 30;
//        dayIn[11] = 31;
//
//        String[] dayNames = new String[7];
//        dayNames[0] = "Mon";
//        dayNames[1] = "Tue";
//        dayNames[2] = "Wed";
//        dayNames[3] = "Thu";
//        dayNames[4] = "Fri";
//        dayNames[5] = "Sat";
//        dayNames[6] = "Sun";

//        <element type>[] <name> = {<value>, <value>, <value>, ..., <value>};
//        int[] dayIn = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        String[] dayNames = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
//    }





//    public static void main(String[] sam) {
//        int[] list = new int[6];
//        for (int i = 0; i < list.length; i++) {
//            list[i] = 2 * i + 1;
//            list[i]++;
//        }
//
//        System.out.println(list[-1]);
//
//        System.out.println("first: " + list[0]);
//        System.out.println("second: " + list[1]);
//        System.out.println("third: " + list[2]);
//        System.out.println("forth: " + list[3]);
//        System.out.println("fifth: " + list[4]);
//        System.out.println("sixth: " + list[5]);
//        System.out.println();
//        System.out.println(list[list.length / 2]);
//
//
//    }
}