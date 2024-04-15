/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dalia
 */

import java.util.List;

// Defines methods for fetching book information

public class BookServiceImpl implements BookService {
    
    private BookDAO bookDAO = new BookDAOImpl();

    @Override
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    @Override
    public Book getBookById(int id) {
        return bookDAO.getBookById(id);
    }
    
}
