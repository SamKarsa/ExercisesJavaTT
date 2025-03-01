/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.POO.Biblioteca;
import java.util.ArrayList;

/**
 *
 * @author Est01
 */
public class Library {
    private ArrayList<Book> books;
    
    public Library(){
        this.books = new ArrayList <>();
    }
    
    public void addBook(Book book){
        books.add(book);
    }
    
    public void removeBook(Book book){
        books.remove(book);
    }
    
    public Book findBook(String ISBN){
        for(Book book: books){
            if(book.getISBN().equals(ISBN)){
                return book;
            }
        }
        return null;
    }
    
    //Getter 
    public ArrayList<Book> getBooks(){
        return books;
    }

    public void showAllBooks(){
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book book: books){
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}
