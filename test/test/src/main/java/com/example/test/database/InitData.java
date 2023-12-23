package com.example.test.database;


import com.example.test.utils.IFileReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitData implements CommandLineRunner {
    @Autowired
    private IFileReader iFileReader;
    @Override
    public void run(String... args) throws Exception {
//        BookData.bookList = iFileReader.readFile("books.json");
//        System.out.println(BookData.bookList);
        BookData.bookList = iFileReader.readFile("books.csv");
        System.out.println(BookData.bookList);
    }
}
