import interfaces.Circle;
import interfaces.Rectangle;
import interfaces.Shape;
import interfaces.Triangle;
import poly.A;
import poly.B;
import poly.C;
import poly.D;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Rectangle(18, 18);
        shapes[1] = new Triangle(30, 30, 30);
        shapes[2] = new Circle(12);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Area = " + shapes[i].getArea() + ", perimeter = " + shapes[i].getPerimeter());
        }

//        var rectangle = new Rectangle(5.0, 4.0);
//        System.out.println(rectangle.getArea());

//        A[] elements = {new A(), new B(), new C(), new D()};
//
//        for (int i = 0; i < elements.length; i++) {
//            System.out.println(elements[i]);
//            elements[i].method1();
//            elements[i].method2();
//            System.out.println();
//        }

























//        Employee[] employees = {new Employee(), new Secretary(), new Lawyer(), new LegalSecretary()};
//
//        for (Employee e : employees) {
//            System.out.print(e.getHours() + ", ");
//            System.out.printf("$%.2f, ", e.getSalary());
//            System.out.print(e.getVacationDays() + ", ");
//            System.out.print(e.getVacationForms() + ", ");
//            System.out.println(e);
//        }

//        Employee ed = new Secretary();
//        ((Secretary) ed).takeDictation("Hello!");



//        System.out.print("Employee: ");
//
//        var edna = new Employee();
//        System.out.print(edna.getHours());
//        System.out.printf(", %.2f, ", edna.getSalary());
//        System.out.printf("%d, ", edna.getVacationDays());
//        System.out.printf("%s.", edna.getVacationForms());
//
//        System.out.println();
//
//        var stan = new Secretary();
//        System.out.print("Secretary: ");
//        System.out.print(stan.getHours());
//        System.out.printf(", %.2f, ", stan.getSalary());
//        System.out.printf("%d, ", stan.getVacationDays());
//        System.out.printf("%s, ", stan.getVacationForms());
//        stan.takeDictation("I can read haha.");












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

//    public boolean equals(Object o) {
//        if (o instanceof Point) {
//            Point other = (Point) o;
//            return x == other.x && y == other.y;
//        } else {
//            return false;
//        }
//        return false;
//    }
}