package com.example.test.service;

import com.example.test.dao.BookDAO;
import com.example.test.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDAO bookDAO;

    public List<Book> getAllBooks() {
        return bookDAO.findAll();
    }
    public Book getBookById(int id) {
        return bookDAO.findById(id);
    }
}
