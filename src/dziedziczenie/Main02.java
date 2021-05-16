package dziedziczenie;

public class Main02 {
    public static void main(String[] args) {
        Shape s1 = new Shape(0,0,"blue");
        Shape s2 = new Shape(3,4,"red");

        s1.getDescription();
        s2.getDescription();

        System.out.println(s1.getDistance(s2));
        System.out.println(s2.getDistance(s1));

        Circle c1 = new Circle(2, 2, "black", 5);
        Circle c2 = new Circle(8, 10, "white", 1);

        c1.getDescription();
        c1.getArea();
        c2.getDescription();
        c2.getCircuit();

        System.out.println(c1.getDistance(c2));
        System.out.println(c2.getDistance(c1));

    }
}
