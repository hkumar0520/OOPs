package AwesomeLLD.Association;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private Library library;

    public Book(String title, Library library){
        this.title = title;
        this.library = library;
    }

    public void showLibrary(){
        System.out.println(title + " is in " + library.getName());
    }

    public String getTitle(){
        return title;
    }
}

class Library{
    private String name;
    private List<Book> books;

    public Library(String name){
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public String getName(){
        return name;
    }

    public void showBooks(){
        System.out.println("Books in " + name + ":");
        for(Book book: books)
            System.out.println(" - " + book.getTitle());
    }
}

public class BidirectionalAssociationExample {
    public static void main(String[] args) {

        Library library = new Library("City Library");
        Book book1 = new Book("1984", library);
        Book book2 = new Book("Brave new World", library);

        library.addBook(book1);
        library.addBook(book2);

        library.showBooks();
        book1.showLibrary();
        book2.showLibrary();

    }
}
