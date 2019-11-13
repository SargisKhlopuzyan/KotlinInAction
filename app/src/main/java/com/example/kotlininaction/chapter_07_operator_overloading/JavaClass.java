package com.example.kotlininaction.chapter_07_operator_overloading;

public class JavaClass {

    public Point minusJavaVersion(Point point1, Point point2) {
        return new Point(point1.getX() - point2.getX(), point1.getY() - point2.getY());
    }

}