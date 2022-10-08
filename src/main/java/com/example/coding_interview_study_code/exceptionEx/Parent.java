package com.example.coding_interview_study_code.exceptionEx;

import java.sql.SQLException;

public class Parent {

    public void foo() throws SQLException {
        System.out.println("SQLException을 발생시키는 Parnet클래스의 foo메서드 실행");

        throw new SQLException("Parnet클래스의 foo메서드에서 SQLException을 발생");
    }

    public void buzz() {

        System.out.println("Exception이 발생하지않는 Parnet클래스의 buzz메서드 실행");
    }
}
