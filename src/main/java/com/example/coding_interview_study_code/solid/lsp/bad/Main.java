package com.example.coding_interview_study_code.solid.lsp.bad;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);

        Rectangle square = new Square();
        square.setWidth(10);
        square.setHeight(5);

        System.out.println("rectangle area = " + rectangle.getArea());
        System.out.println("square area = " + square.getArea());

    }
}

