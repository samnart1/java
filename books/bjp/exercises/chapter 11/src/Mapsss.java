import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Mapsss {
    public static void main(String[] args) throws FileNotFoundException {

        File mobyDick = new File("mobydick.txt");


        Map<String, Integer> wordCountMap = new TreeMap<>();
        Scanner scanner = new Scanner(mobyDick);
        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();
        }

//        Map<Integer, String> ssnMap = new TreeMap<>();
//        ssnMap.put(867530912, "Jenny");
//        ssnMap.put(239876305, "Stuart Reges");
//        ssnMap.put(504386382, "Marty Stepp");
//        System.out.println(ssnMap);


//        Map<Integer, String> ssnMap = new HashMap<>();
//        ssnMap.put(867530912, "Jenny");
//        ssnMap.put(239876305, "Stuart Reges");
//        ssnMap.put(504386382, "Marty Stepp");
//
//
//        Set<Integer> ssnSet = ssnMap.keySet();
//        for (int ssn : ssnSet) {
//            System.out.println("SSN: " + ssn);
//        }
//
//        System.out.println();
//
//        Collection<String> names = ssnMap.values();
//        for (String name : names) {
//            System.out.println("Name: " + name);
//        }
//
//        System.out.println();
//
//        for (int ssn : ssnMap.keySet()) {
//            String name = ssnMap.get(ssn);
//            System.out.println(name + "'s SSN is " + ssn);
//        }





















//        Map<String, Double> salaryMap = new HashMap<>();
//        salaryMap.put("Stuart Reges", 10000.00);
//        salaryMap.put("Marty Stepp", 95500.00);
//        salaryMap.put("Jenny", 86753.09);
//
//        double jenSalary = salaryMap.get("Jenny");
//        System.out.printf("Jenny's salary is $%.2f\n", jenSalary);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Type a person's name: ");
//        String name = scanner.nextLine();
//        // search the map for the given name
//        if (salaryMap.containsKey(name)) {
//            double salary = salaryMap.get(name);
//            System.out.printf("%s's salary is $%.2f", name, salary);
//        } else {
//            System.out.println("I don't have a record for " + name);
//        }
//
//        System.out.println(salaryMap);
    }
}
