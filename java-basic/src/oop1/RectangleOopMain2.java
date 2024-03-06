package oop1;

public class RectangleOopMain2 {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.area();
        int perimeter = rectangle.perimeter();
        String result = rectangle.isSquare();
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(result);
    }
}
