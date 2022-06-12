package Java;

public class RectangleOfShape extends Shape {
    private double width;
    private double length;

    public RectangleOfShape(){};

    public RectangleOfShape(double width, double length, String orange, boolean b) {
        this.width = width;
        this.length = length;
    }

    public RectangleOfShape(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*this.length;
    }

    public double getPerimeter(){
        return 2*(width+this.length);
    }

    @Override
    public String toString() {
        return "RectangleOfShape{" +
                "width=" + width +
                ", length=" + length +
                '}'+"subclass of "+super.toString();
    }
}
