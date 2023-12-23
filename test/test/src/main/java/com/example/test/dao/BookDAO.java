package com.example.test.dao;

import com.example.test.database.BookData;
import com.example.test.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAO {
    public List<Book> findAll() {
        return BookData.bookList;
    }

    public Book findById(int id) {
        for (Book book : BookData.bookList) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}
