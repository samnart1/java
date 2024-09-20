import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HSet {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> stooges = new HashSet<>();
        stooges.add("Larry");
        stooges.add("Moe");
        stooges.add("Curly");
        stooges.add("Moe");
        stooges.add("Shemp");
        stooges.add("Moe");
        System.out.println(stooges);

        Iterator<String> itr = stooges.iterator();
        while (itr.hasNext()) {
            String word = itr.next();
            System.out.println(word);
        }

        for (String word : stooges) {
            System.out.println(". " + word);
        }

        Set<String> words = new TreeSet<>();
        Scanner scanner = new Scanner(new File("mobydick.txt"));

        while (scanner.hasNext()){
            String word = scanner.next();
            word = word.toLowerCase();
            if (word.startsWith("a") && word.length() == 3) {
                words.add(word);
            }
        }

        System.out.println("Three-letter 'a' words = " + words);

    }

    public static boolean hasDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set.size() < list.size();
    }
}
