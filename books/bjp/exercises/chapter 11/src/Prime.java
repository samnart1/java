import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("This program will tell you all prime");
        System.out.println("numbers up to a given maximum");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Maximum number? ");
        int max = scanner.nextInt();

        List<Integer> primes = sieve(max);
        System.out.println("Prime numbers up to " + max + ":");
        System.out.println(primes);


    }

    public static List<Integer> sieve(int max) {
        List<Integer> primes = new LinkedList<>();
        List<Integer> numbers = new LinkedList<>();
        for (int i = 2; i <= max; i++) {
            numbers.add(i);
        }
        while (!numbers.isEmpty()) {
            // remove a prime number from the front of the list
            int front = numbers.remove(0);
            primes.add(front);
            // remove all multiples of this prime number
            Iterator<Integer> itr = numbers.iterator();
            while (itr.hasNext()) {
                int current = itr.next();
                if (current % front == 0) {
                    itr.remove();
                }
            }
        }
        return primes;
    }
}
