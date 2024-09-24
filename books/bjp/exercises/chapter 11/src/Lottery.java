import java.util.*;

public class Lottery {
    public static final int PRIZE = 100;
    public static final int NUMBERS = 6;
    public static final int SIZE = 40;

    public static void main(String[] args) {

        // call the methods for winning and ticket
        Set<Integer> winningNumbers = winningNumbers();
        Set<Integer> ticket = ticket();
        System.out.println();

        Set<Integer> matches = new TreeSet<>(ticket);
        ticket.retainAll(winningNumbers);

        // print results
        System.out.println("Your ticket was: " + ticket);
        System.out.println("The winning numbers were: " + winningNumbers);
        if (matches.size() > 0) {
            double prize = PRIZE * Math.pow(2, matches.size());
            System.out.println("Matched numbers: " + matches);
            System.out.printf("Your prize is $%.2f\n", prize);
        }

    }

    public static Set<Integer> winningNumbers() {
        Set<Integer> winningNumbers = new TreeSet<>();
        Random r = new Random();
        while (winningNumbers.size() < NUMBERS) {
            int number = r.nextInt(SIZE) + 1;
            winningNumbers.add(number);
        }
        return winningNumbers;
    }

    public static Set<Integer> ticket() {
        Set<Integer> ticket = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        while (ticket.size() < NUMBERS) {
            System.out.println("Enter your numbers: ");
            int number = scanner.nextInt();
            ticket.add(number);
        }
        return ticket;
    }
}
