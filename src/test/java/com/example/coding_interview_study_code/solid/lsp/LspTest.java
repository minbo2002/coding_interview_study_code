package com.example.coding_interview_study_code.solid.lsp;

import com.example.coding_interview_study_code.solid.lsp.bad.Rectangle;
import com.example.coding_interview_study_code.solid.lsp.bad.Square;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class LspTest {

    public int getArea(Rectangle rectangle) {

        rectangle.setHeight(10);
        rectangle.setWidth(20);

        return rectangle.getArea();
    }

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle();
        Rectangle square = new Square();

        log.info("rectangle area = " + getArea(rectangle));
        log.info("square area = " + getArea(square));

    }
}
