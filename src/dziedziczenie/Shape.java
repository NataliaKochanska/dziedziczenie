package dziedziczenie;

public class Shape {
    protected double x;
    protected double y;
    protected String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        String result = "x: " + x + ", y: " + y + ", color: " + color;
        System.out.println(result);
        return result;
    }

    public double getDistance(Shape shape) {
        double a = Math.abs(this.x - shape.x);
        double b = Math.abs(this.y - shape.y);
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }


}
