package com.example.coding_interview_study_code.codingtest.librarysystempackage;

import com.example.coding_interview_study_code.codingtest.librarysystempackage.reader.Book;
import com.example.coding_interview_study_code.codingtest.librarysystempackage.reader.OnlineReaderSystem;
import com.example.coding_interview_study_code.codingtest.librarysystempackage.reader.Reader;

public class Main {

    public static void main(String[] args) {

        Reader reader = new Reader("Kim MinBo", "minbo@gmail.com");
        Book book = new Book("Lee SangMin", "JAVA", "ISBN:001-OG");

        OnlineReaderSystem onlineReaderSystem = new OnlineReaderSystem();

        onlineReaderSystem.addReader(reader);
        onlineReaderSystem.addBook(book);

        onlineReaderSystem.displayReader(reader.getEmail());
        onlineReaderSystem.displayBook(book);

        onlineReaderSystem.nextPage();
        onlineReaderSystem.nextPage();
        onlineReaderSystem.nextPage();
        onlineReaderSystem.previousPage();
    }
}
