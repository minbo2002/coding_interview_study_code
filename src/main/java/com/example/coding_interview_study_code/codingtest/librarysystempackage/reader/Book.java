package com.example.coding_interview_study_code.codingtest.librarysystempackage.reader;

import java.util.Objects;

public class Book {

    private final String author;
    private final String title;
    private final String isbn;  // 국제표준 도서번호

    public Book(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public String fetchPage(int pageNr) {
        return "Some page content";
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.isbn);  // 홀수이면서 소수인 47
        return hash;
    }

    @Override
    public boolean equals(Object obj) {  // equals를 재정의 할때에는 반드시 hashCode도 재정의 해야한다.
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final Book other = (Book) obj;

        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }

        return true;
    }
}
