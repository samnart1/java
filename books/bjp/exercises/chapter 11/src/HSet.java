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

//        Set<String> words = new TreeSet<>();
//        Scanner scanner = new Scanner(new File("mobydick.txt"));
//
//        while (scanner.hasNext()){
//            String word = scanner.next();
//            word = word.toLowerCase();
//            if (word.startsWith("a") && word.length() == 3) {
//                words.add(word);
//            }
//        }

//        System.out.println("Three-letter 'a' words = " + words);

        lotto();

    }

    public static boolean hasDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return set.size() < list.size();
    }

    // Returns the number of unique elements contained in either set1 or set2. Not a good model to follow
//    public static int totalElements(Set<String> set1, Set<String> set2) {
//        int count = set1.size();
//        for (String element : set2) {
//            if (!set1.contains(element)) {
//                count++;
//            }
//        }
//        return count;
//    }

    // returns the number of elements contained in both set1 and set2
    public static int totalElements(Set<String> set1, Set<String> set2) {
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        return union.size();
    }






    public static void lotto() {
        Set<Integer> winningNumbers = new TreeSet<>();
        Random r = new Random();
        while (winningNumbers.size() < 6) {
            int number = r.nextInt(40) + 1;
            winningNumbers.add(number);
        }
        System.out.println(winningNumbers);

//        Set<Integer> intersection = new TreeSet<>(ticket);
//        intersection.retainAll(winningNumbers);
//        int interSize = intersection.size();
    }























}
