import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.print("Employee: ");

        var edna = new Employee();
        System.out.print(edna.getHours());
        System.out.printf(", %.2f, ", edna.getSalary());
        System.out.printf("%d, ", edna.getVacationDays());
        System.out.printf("%s.", edna.getVacationForms());

        System.out.println();

        var stan = new Secretary();
        System.out.print("Secretary: ");
        System.out.print(stan.getHours());
        System.out.printf(", %.2f, ", stan.getSalary());
        System.out.printf("%d, ", stan.getVacationDays());
        System.out.printf("%s, ", stan.getVacationForms());
        stan.takeDictation("I can read haha.");












//        var p1 = new Point(7, 2);
//
//        System.out.println("p1 is: " + p1.toString());
//
//        System.out.println();
//
//        System.out.printf("P1 is (%d, %d)\n", p1.getX(), p1.getY());
//        double p1Distance = p1.distanceFromOrigin(7, 2);
//        System.out.printf("Distance of p1 from origin: %.2f\n", p1Distance);
//
//        var p2 = new Point(4, 3);
//
//        System.out.printf("P2 is (%d, %d)\n", p2.getX(), p2.getY());
//        double p2Distance = p2.distanceFromOrigin(p2.getX(), p2.getY());
//        System.out.printf("Distance of p2 from origin: %.2f\n", p2Distance);
//
//        p1.translate(11, 18);
//        p2.translate(2938, 2983);

    }

//    public static void myMethod(Object o) {}
//    public static Object tryingHaha(Object o) {
//        return o;
//    }

    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else {
            return false;
        }
        return false;
    }
}