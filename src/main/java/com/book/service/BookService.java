package com.book.service;

import com.book.dao.BookDao;
import com.book.domain.Book;
import com.book.domain.Lend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private BookDao bookDao;

    @Autowired
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> queryBook(String searchWord){
        return  bookDao.queryBook(searchWord);
    }

    public ArrayList<Book> getAllBooks(){
        return bookDao.getAllBooks();
    }


    public int deleteBook(long bookId){
        return bookDao.deleteBook(bookId);
    }

    public boolean matchBook(String searchWord){
        return bookDao.matchBook(searchWord)>0;
    }

    public boolean addBook(Book book){
        return bookDao.addBook(book)>0;
    }

    public Book getBook(Long bookId){
        Book book=bookDao.getBook(bookId);
        return book;
    }
    public boolean editBook(Book book){
        return bookDao.editBook(book)>0;
    }

}
