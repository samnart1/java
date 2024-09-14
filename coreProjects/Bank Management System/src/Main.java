import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("hello");
        words.add("goodbye");
        words.add("this");
        words.add("that");
        System.out.println(words);

        int i = 0;
        while (i < words.size()){
            String element = words.get(i);
            if (element.length() % 2 == 0) {
                words.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(words);
    }
}