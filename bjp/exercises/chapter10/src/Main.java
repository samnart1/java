import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void replace(ArrayList<String> list, String target, String replacement) {
        int index = list.indexOf(target);
        if (index >= 0) {
            list.set(index, replacement);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> list = new ArrayList<>(List.of("Samuel", "Armin", "Eren", "Erwin", "Levi"));

        int sum = 0;
        for (String s : list) {
            sum += s.length();
        }

        System.out.println("Total of lengths = " + sum);

//        ArrayList<String> dayNames = new ArrayList<>(List.of("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));



        // ARRAYLIST SEARCHING METHODS

//        ArrayList<String> words = new ArrayList<>();
//        words.add("four");
//        words.add("score");
//        words.add("and");
//        words.add("seven");
//        words.add("years");
//        words.add("ago");
//
//        System.out.println("words = " + words);
//
//        for (int i = 0; i < words.size(); i += 2) {
//            words.add(i, "~");
//        }
//
//        System.out.println("after loop words ~ : " + words);
//
//        for (int i = 0; i < words.size(); i++) {
//            words.remove(i);
//        }
//
//        System.out.println("words after remove loop: " + words);


//        ArrayList<String> stopWords = new ArrayList<>();
//        stopWords.add("a");
//        stopWords.add("be");
//        stopWords.add("by");
//        stopWords.add("how");
//        stopWords.add("in");
//        stopWords.add("is");
//        stopWords.add("it");
//        stopWords.add("of");
//        stopWords.add("on");
//        stopWords.add("or");
//        stopWords.add("that");
//        stopWords.add("the");
//        stopWords.add("this");
//        stopWords.add("to");
//        stopWords.add("why");
//
//        Scanner scanner = new Scanner(new File("speech.txt"));
//        while (scanner.hasNext()) {
//            String next = scanner.next();
//            if (!stopWords.contains(next.toLowerCase())) {
//                System.out.print(next + " ");
//            }
//        }





//        ArrayList<String> list = new ArrayList<>();
//        list.add("to");
//        list.add("be");
//        list.add("or");
//        list.add("not");
//        list.add("to");
//        list.add("be");
//        System.out.println(list);
//        replace(list, "be", "beep");
//        System.out.println("final list = " + list);

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