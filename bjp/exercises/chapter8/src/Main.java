import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var p1 = new Point(7, 2);

        System.out.println("p1 is: " + p1.toString());

        System.out.println();

        System.out.printf("P1 is (%d, %d)\n", p1.x, p1.y);
        double p1Distance = p1.distanceFromOrigin(7, 2);
        System.out.printf("Distance of p1 from origin: %.2f\n", p1Distance);

        var p2 = new Point(4, 3);

        System.out.printf("P2 is (%d, %d)\n", p2.x, p2.y);
        double p2Distance = p2.distanceFromOrigin(p2.x, p2.y);
        System.out.printf("Distance of p2 from origin: %.2f\n", p2Distance);

        p1.translate(11, 18);
        p2.translate(2938, 2983);

    }
}