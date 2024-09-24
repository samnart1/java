import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> words = new LinkedList<>();
        words.add("hello");
        words.add("goodbye");
        words.add("this");
        words.add("that");

//        Iterator<E>itr = list.iterator()

        List<Integer> haha = new LinkedList<>();


    }


//    public static void removeEvenLength(LinkedList<String> list) {
//        int i = 0;
//        while (i < list.size()) {
//            String element = list.get(i);
//            if ((element.length() & 2) == 0) {
//                list.remove();
//            } else {
//                i++;
//            }
//        }
//    }

    //  USING ITERATOR
    public static void removeEvenLength(LinkedList<String> list) {
       Iterator<String> itr = list.iterator();
       while (itr.hasNext()) {
           String element = itr.next();
           if (element.length() % 2 == 0) {
               itr.remove();
           }
       }
    }

    public static List<String> removeEvenlength(List<String> list) {
        return list.stream()
                .filter(s -> s.length() % 2 != 0 )
                .collect(Collectors.toList());
    }

    // returns the longest string in the given list
    // pre: list.size() > 0

    public static String longest(List<String> list) {
        Iterator<String> i = list.iterator();
        String result = i.next();
        while (i.hasNext()) {
            String next = i.next();
            if (next.length() > result.length()) {
                result = next;
            }
        }
        return result;
    }
}