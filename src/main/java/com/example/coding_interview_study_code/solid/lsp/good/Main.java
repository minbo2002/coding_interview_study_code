package com.example.coding_interview_study_code.solid.lsp.good;

public class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(10, 20);
        Shape square = new Square(10);

        System.out.println("rectangle area = " + rectangle.getArea());
        System.out.println("square area = " + square.getArea());
    }
}
