package oop1;

public class RectangleOopMain {

    public static void main(String[] args) {

        int width = 5;
        int height = 5;
        int area = calculateArea(width, height);
        System.out.println("넓이 : " + area);

        int perimeter = calculatePerimeter(width, height);
        System.out.println("둘레 : " + perimeter);

        String square = isSquare(width, height);
        System.out.println("정사각형 여부 : " + square);
    }

    public static int calculateArea(int width, int height) {

        return width * height;
    }

    public static int calculatePerimeter(int width, int height) {

        return 2 * (width + height);
    }

    public static String isSquare(int width, int height) {

        String result;
        if (width == height) {

            result = "정사각형 O";
        } else {

            result = "정사각형 X";
        }
        return result;
    }




}
