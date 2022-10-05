package com.example.coding_interview_study_code.solid.lsp.bad;

import lombok.Data;

public class Rectangle {

    int width;
    int height;

    public int getArea() {

        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}


