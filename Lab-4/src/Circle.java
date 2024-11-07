public class Circle extends Shape{


    private double radius;


    Circle(int x , int y){
        super(x,y);
    }
    public Circle(int x , int y, double radius) {
        super(x,y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area =  Math.PI * radius * radius;
        return Math.round(area);
    }

    @Override
    public double calculateCircumference() {
        return  2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "The Area for a circle with radius (" + radius + ") = " + calculateArea() + "\nand the Circumference = " + calculateCircumference();
    }
}
