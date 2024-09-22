import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);

        writeStars(10);
        reverse(scanner);
    }

    public static void writeStars(int n) {
        if (n == 0) {
            System.out.println();
        } else {
            System.out.println("*");
            writeStars(n - 1);
        }
    }

    public static void reverse(Scanner input) {
        if (input.hasNextLine()) {
            String line = input.nextLine();
            reverse(input);
            System.out.println(line);
        }
    }
}