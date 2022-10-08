package com.example.coding_interview_study_code.solid.lsp.good;

public class Square implements Shape {

    int length;

    @Override
    public int getArea() {
        return length * length;
    }

    public Square(int length) {
        this.length = length;
    }
}
