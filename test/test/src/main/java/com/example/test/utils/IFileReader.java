package com.example.test.utils;

import com.example.test.model.Book;

import java.io.IOException;
import java.util.List;

public interface IFileReader{
    List<Book> readFile(String filePath) throws IOException;

}
