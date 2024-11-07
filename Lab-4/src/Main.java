//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Circle Class : ");
        Circle circle = new Circle(0,0,2.5);
        System.out.println(circle.toString());
        System.out.println(circle.getRadius());

        System.out.println("----");
        Circle circle1 = new Circle(5,5);
        circle1.setRadius(1.5);
        System.out.println(circle1.toString());
        System.out.println(circle1.calculateCircumference());
        System.out.println("----------------");

//----------------------------------------------------

        System.out.println("Rectangle Class: ");
        Rectangle rectangle = new Rectangle(0,0,2,4.5);
        System.out.println(rectangle.toString());
        System.out.println( "Rectangle Height: " + rectangle.getHeight());
        System.out.println( "Rectangle Width: " +rectangle.getWidth());

        System.out.println("----");
        Rectangle rectangle1 = new Rectangle(2,2);
        rectangle1.setHeight(1);
        rectangle1.setWidth(1.5);
        System.out.println(rectangle1.toString());
        System.out.println(rectangle1.calculateArea());
        System.out.println("----------------");

//------------------------------------------------------------

        System.out.println("Triangle Class: ");
        Triangle triangle = new Triangle(0,0,4,6);
        System.out.println(triangle.toString());
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculateCircumference());
        System.out.println(triangle.getHeight());

        System.out.println("----");
        Triangle triangle1 = new Triangle(1,1);
        triangle1.setHeight(3.5);
        triangle1.setBase(2);
        System.out.println(triangle1.toString());

        System.out.println(triangle1.getBase());

    }
}