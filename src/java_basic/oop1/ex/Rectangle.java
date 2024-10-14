package java_basic.oop1.ex;

public class Rectangle {
    int width = 5;
    int height = 8;
    int area = 0;
    int perimeter = 0;
    boolean square = false;

    void calculateArea() {
        area = width * height;
        System.out.println("넓이는 : " + area + "입니다");
    }

    void calculatePerimeter() {
        perimeter = 2 * (height + width);
        System.out.println("길이는 : " + perimeter + " 입니다");
    }

    void isSquare() {
        if(width==height) {
            square = true;

        }
        System.out.println("정사각형 여부 : " + square);
    }
}
