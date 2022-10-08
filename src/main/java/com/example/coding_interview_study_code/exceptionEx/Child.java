package com.example.coding_interview_study_code.exceptionEx;

import java.sql.BatchUpdateException;

public class Child extends Parent{

    @Override
    public void foo() throws BatchUpdateException {
        System.out.println("BatchUpdateException을 발생시키는 Child클래스의 foo메서드 실행");

        throw new BatchUpdateException("Child클래스의 foo메서드에서 BatchUpdateException이 발생", new int[0]);
    }

    @Override
    public void buzz() {
        throw new RuntimeException("RuntimeException을 발생시키는 Child클래스의 buzz메서드 실행");
    }

}
