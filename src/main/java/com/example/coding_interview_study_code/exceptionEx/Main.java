package com.example.coding_interview_study_code.exceptionEx;

import java.sql.BatchUpdateException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        try {
            p.foo();
        } catch (SQLException ex) {
            System.err.println(ex);  // java.sql.SQLException: Parnet클래스의 foo메서드에서 SQLException을 발생
        }

        System.out.println();  // SQLException을 발생시키는 Parnet클래스의 foo메서드 실행

        try {
            c.foo();
        } catch (BatchUpdateException ex) {
            System.err.println(ex);  // java.sql.BatchUpdateException: Child클래스의 foo메서드에서 BatchUpdateException이 발생
        }

        System.out.println();  // BatchUpdateException을 발생시키는 Child클래스의 foo메서드 실행

        p.buzz();
        System.out.println();  // Exception이 발생하지않는 Parnet클래스의 buzz메서드 실행

        try {
            c.buzz();
        } catch (RuntimeException ex) {
            System.err.println(ex);  // java.lang.RuntimeException: RuntimeException을 발생시키는 Child클래스의 buzz메서드 실행
        }
    }
}
