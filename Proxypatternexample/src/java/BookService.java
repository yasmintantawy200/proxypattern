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
public interface BookService {
    
    List<Book> getAllBooks();
    Book getBookById(int id);
    
}
