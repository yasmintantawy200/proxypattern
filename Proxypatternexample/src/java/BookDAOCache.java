/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dalia
 */
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class BookDAOCache {
// Implements a simple cache for storing book information
    private Map<Integer, Book> cache = new HashMap<>();

    public void cacheAllBooks(List<Book> books) {
        for (Book book : books) {
            cache.put(book.getId(), book);
        }
    }

    public List<Book> getAllCachedBooks() {
        return new ArrayList<>(cache.values());
    }

    public void cacheBook(Book book) {
        cache.put(book.getId(), book);
    }

    public Book getCachedBook(int id) {
        return cache.get(id);
    }

    public boolean isCacheEmpty() {
        return cache.isEmpty();
    }

    public boolean isBookCached(int id) {
        return cache.containsKey(id);
    }
}


