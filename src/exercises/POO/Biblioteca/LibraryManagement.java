/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.POO.Biblioteca;
import java.util.Scanner;

/**
 *
 * @author Est01
 */
public class LibraryManagement {
    private Library library;

    public LibraryManagement(Library library) {
        this.library = library;
    }
    
    public void addBook(Book book){
        library.addBook(book);
    }
    
    public void removeBook(Book book){
        library.removeBook(book);
    }
    
    public void showMenu(){
        Scanner sc = new Scanner (System.in);
        
        while(true){
            System.out.print("Menu\n1. Add book\n2. Remove book\n3. Find book\n4. List books\n5. Leave\nEnter the option: ");
            int option = sc.nextInt();
            sc.nextLine();  // Limpiar buffer de entrada
            
            switch(option){
                case 1:
                    MenuAddBook();
                    break;
                case 2: 
                    MenuRemoveBook();
                    break;
                case 3:
                    MenuFindBook();
                    break;
                case 4:
                    MenuListBooks();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }
    
    public void MenuAddBook(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter the ISBN: ");
        String ISBN = sc.nextLine();
        
        Book nBook = new Book(title, author, ISBN);
        
        addBook(nBook);
    }
    
    public void MenuRemoveBook(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the ISBN: ");
        String ISBN = sc.nextLine();
        
        Book nbook = library.findBook(ISBN);
        
        removeBook(nbook);
    }
    
    public  void MenuFindBook(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the ISBN: ");
        String ISBN = sc.nextLine();
        
        Book nbook = library.findBook(ISBN);
        System.out.println(nbook);
    }
    
    public void MenuListBooks(){
        library.showAllBooks();
    }
    
    
    public static void main(String[] args){        
        // Crear una instancia de Library
        Library library = new Library();

        // Crear una instancia de LibraryManagement usando la biblioteca
        LibraryManagement management = new LibraryManagement(library);
        
        management.showMenu();
    }
}
