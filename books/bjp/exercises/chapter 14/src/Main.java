import java.util.*;

public class Main {
    public static void main(String[] args) {

//        System.out.println(makeRandomQueue(10));
//        System.out.println(makeRandomStack(10));
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        int sum = sumOfQueue(q);
        System.out.println(sum);
//

//        String[] words = {"to", "be", "or", "not", "to", "be"};
//        String[] word1 = {"to", "be", "or", "not", "to", "be"};
//
//        Stack<String> s = new Stack<>();
//        Queue<String> q = new LinkedList<>();
//
//        for (String str : words) {
//            s.push(str);
//        }
//
//        for (String str : word1) {
//            q.add(str);
//        }
//
//        System.out.println("Stack = " + s);
//        System.out.println("Size = " + s.size());
//        System.out.println("Peek = " + s.peek());
//
//        while (!s.empty()) {
//            System.out.print(s.pop() + " ");
//        }
//
//        System.out.println();
//
//        System.out.println("Queue = " + q);
//        System.out.println("Size = " + q.size());
//        System.out.println("Peek = " + q.peek());
//
//        while (!q.isEmpty()) {
//            System.out.print(q.remove() + " ");
//        }
//
//        System.out.println();

    }

    public static int sumOfQueue(Queue<Integer> q) {
        int sum = 0;

        for (int i = 0; i < q.size(); i++) {
            int number = q.remove();
            sum += number;
            q.add(number);
        }

        return sum;
    }

    public static Queue<Integer> makeRandomQueue(int size) {
        Queue<Integer> q = new LinkedList<>();

        Random r = new Random();

        for (int i = 0; i < size; i++) {
            q.add(r.nextInt(100));
        }

        return q;
    }

    public static Stack<Integer> makeRandomStack(int size) {
        Stack<Integer> s = new Stack<>();

        Random r = new Random();

        for (int i = 0; i < size; i++) {
            s.push(r.nextInt(100));
        }


        return s;
    }
}