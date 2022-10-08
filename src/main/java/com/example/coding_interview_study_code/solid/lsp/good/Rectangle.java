package com.example.coding_interview_study_code.solid.lsp.good;

public class Rectangle implements Shape {

    int width;
    int height;

    @Override
    public int getArea() {
        return width * height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
