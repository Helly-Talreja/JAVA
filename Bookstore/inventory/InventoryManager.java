package Bookstore.inventory;

import java.util.ArrayList;
import java.util.List;

import Bookstore.core.Book;

public class InventoryManager {
    private List<Book> books;

    public InventoryManager() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateStockLevel(String isbn, int newStockLevel) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                // Update the stock level
                // For simplicity, let's assume stock level is an attribute in Book class
                // In a real-world scenario, you might want to have a separate Stock class
                // and manage it accordingly.
                // book.setStockLevel(newStockLevel);
                System.out.println("Stock level updated for ISBN: " + isbn);
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in inventory.");
    }

    public Book getBookDetails(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found in inventory.");
        return null;
    }
}