import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void replace(ArrayList<String> list, String target, String replacement) {
        int index = list.indexOf(target);
        if (index >= 0) {
            list.set(index, replacement);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        // ARRAYLIST SEARCHING METHODS
        ArrayList<String> list = new ArrayList<>();
        list.add("to");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
        System.out.println(list);
        replace(list, "be", "beep");
        System.out.println("final list = " + list);

//        Scanner scanner = new Scanner(new File("names.txt"));
//        ArrayList<String> list = new ArrayList<>();
//        while (scanner.hasNext()) {
//            String name = scanner.next();
//            if (!list.contains(name)) {
//                list.add(name);
//            }
//        }
//
//        System.out.println("list = " + list);











//        // construct a bands of strings (long form)
//        ArrayList<String> bands = new ArrayList<>();
//        bands.add("Tool");
//        bands.add("Phish");
//        bands.add("Pink Floyd");
//        System.out.println("My fave bands: " + bands);
//        System.out.println();
//        bands.add(1, "U2");
//        System.out.println(bands);
//        bands.remove(3);
//        System.out.println(bands);
//
//        int sum = 0;
//        for (int i = 0; i < bands.size(); i++) {
//            String s = bands.get(i);
//            sum += s.length();
//        }
//        System.out.println("Total of lengths = " + sum);
//
//        bands.set(0, "The Violent Femmes");
//
//        System.out.println(bands);
//        bands.clear();
//        System.out.println();
//        System.out.println(bands);
//
//        // add
//        // remove
//        // size
//        // get
//        // set
//        // clear
    }
}