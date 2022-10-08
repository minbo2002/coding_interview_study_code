package com.example.coding_interview_study_code.codingtest.librarysystempackage.reader;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private final Map<String, Book> books = new HashMap<>();

    protected void addBook(Book book) {
        books.putIfAbsent(book.getIsbn(), book);  // .putIfAbsent(key, value) : key값이 존재하지않을경우 key, value를 Map에 저장하고 null 반환
    }

    protected boolean remove(Book book) {
        return books.remove(book.getIsbn(), book);
    }

    protected Book find(String isbn) {
        return books.get(isbn);
    }
}
