public class Rectangle extends Shape{

   private double height;
   private double width;

   Rectangle(int x , int y){
       super(x,y);

   }

    public Rectangle(int x , int y ,double height, double width) {
        super(x,y);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "The Area for a  Rectangle with height: " + height+ " ,and width: " + width +" = " + calculateArea() + "\nand the perimeter = " + calculateCircumference();
    }
}
