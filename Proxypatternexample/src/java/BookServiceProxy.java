/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dalia
 */
import java.util.List;
// Implements the BookService interface with caching functionality

public class BookServiceProxy implements BookService {
    
     private BookService bookService = new BookServiceImpl(); // Or whichever implementation you're using
    private BookDAOCache bookDAOCache = new BookDAOCache();

    @Override
    public List<Book> getAllBooks() {
        if (bookDAOCache.isCacheEmpty()) {
            List<Book> books = bookService.getAllBooks();
            bookDAOCache.cacheAllBooks(books);
            return books;
        } else {
            return bookDAOCache.getAllCachedBooks();
        }
    }

    @Override
    public Book getBookById(int id) {
        if (bookDAOCache.isBookCached(id)) {
            return bookDAOCache.getCachedBook(id);
        } else {
            Book book = bookService.getBookById(id);
            bookDAOCache.cacheBook(book);
            return book;
        }
    }
}
