package oop1;

public class Rectangle {

    int width;
    int height;

    int area () {
        return width * height;
    }

    int perimeter () {

        return 2 * (width + height);
    }

    String isSquare () {

        String result;
        if (width == height) {

            result = "정사각형 O";
        } else {

            result = "정사각형 X";
        }
        return result;
    }
}
