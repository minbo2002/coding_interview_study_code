package com.example.coding_interview_study_code.solid.lsp.good;

import lombok.Data;

@Data
public class Shape {

    protected int width;
    protected int height;

    public int getArea() {

        return width * height;
    }
}
