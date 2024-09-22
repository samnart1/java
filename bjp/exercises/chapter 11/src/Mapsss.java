import java.util.*;

public class Mapsss {
    public static void main(String[] args) {
        Map<String, Double> salaryMap = new HashMap<>();
        salaryMap.put("Stuart Reges", 10000.00);
        salaryMap.put("Marty Stepp", 95500.00);
        salaryMap.put("Jenny", 86753.09);

        double jenSalary = salaryMap.get("Jenny");
        System.out.printf("Jenny's salary is $%.2f\n", jenSalary);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a person's name: ");
        String name = scanner.nextLine();
        // search the map for the given name
        if (salaryMap.containsKey(name)) {
            double salary = salaryMap.get(name);
            System.out.printf("%s's salary is $%.2f", name, salary);
        } else {
            System.out.println("I don't have a record for " + name);
        }

        System.out.println(salaryMap);
    }
}
