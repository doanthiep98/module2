package Java;

public class RectangleOfShapeTest {
    public static void main(String[] args) {
        RectangleOfShape rectangle = new RectangleOfShape();
        System.out.println(rectangle);

        rectangle = new RectangleOfShape(2.3, 5.8, "orange", true);
        System.out.println(rectangle);

        rectangle = new RectangleOfShape(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }

}
