import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-3, 2, 8, 12, 17, 29, 44, 58, 79};
        int index = Arrays.binarySearch(numbers, -99);
        System.out.println(index);

        String[] strings = {"c", "b", "g", "h", "d", "f", "e", "a"};
        Arrays.parallelSort(strings);
        System.out.println(Arrays.toString(strings));
    }

    public static List<String> addWords(String fileName) throws FileNotFoundException {
        File file = new File("");
        Scanner scanner = new Scanner(file);
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        return words;
    }
}