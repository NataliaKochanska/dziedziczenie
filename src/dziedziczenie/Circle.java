package dziedziczenie;

public class Circle extends Shape{

    private int radius;

    public Circle(double x, double y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public String getDescription() {
        String result = "x: " + x + ", y: " + y + ", color: " + color;
        System.out.println(result);
        super.getDescription();
        return result;
    }

    public void getArea() {
        double result = Math.PI * Math.pow(radius, 2);
        System.out.println("Pole powierzchni: " + result);
    }
    public void getCircuit() {
        double result = 2 * Math.PI * radius;
        System.out.println("Obwód: " + result);
    }

}
