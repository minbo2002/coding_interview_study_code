package com.example.coding_interview_study_code.codingtest.librarysystempackage.reader;

import java.util.HashMap;
import java.util.Map;

public class ReaderManager {

    private final Map<String, Reader> readers = new HashMap<>();

    protected void addReader(Reader reader) {
        readers.putIfAbsent(reader.getEmail(), reader);
    }

    protected boolean remove(Reader reader) {
        return readers.remove(reader.getEmail(), reader);
    }

    protected Reader find(String email) {
        return readers.get(email);
    }
}
