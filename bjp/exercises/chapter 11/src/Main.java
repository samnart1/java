import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> words = new LinkedList<>();
        words.add("hello");
        words.add("goodbye");
        words.add("this");
        words.add("that");

//        Iterator<E>itr = list.iterator()
        

    }

    public static void removeEvenLength(LinkedList<String> list) {
        int i = 0;
        while (i < list.size()) {
            String element = list.get(i);
            if ((element.length() & 2) == 0) {
                list.remove();
            } else {
                i++;
            }
        }
    }
}