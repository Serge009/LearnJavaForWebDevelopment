package com.apress.books.dao;

import com.apress.books.model.Book;
import com.apress.books.model.Category;

import java.util.List;

/**
 * Created by Matrix on 09.07.2014.
 */
public interface BookDAO {

    /**
     * method for listing all the books from the database
     * @return
     */
    public List<Book> findAllBooks();

    /**
     * allows the user to search books by keyword in the title
     * of the book or by the first and last names of the author
     * @param keyWord
     * @return
     */
    public List<Book> searchBooksByKeyword(String keyWord);

    /**
     * is required by the application to provide a
     * categorized listing of books
     * @return
     */
    public List<Category> findAllCategories();

    public void insert(Book book);

    public void update(Book book);

    public void delete(Long bookId);

}
