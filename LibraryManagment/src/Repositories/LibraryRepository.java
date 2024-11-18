package Repositories;

import Models.Book;
import Models.SubjectCategory;
import Models.Rack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LibraryRepository {
    private Map<Integer, Book> books = new HashMap<Integer, Book>();

    public LibraryRepository()
    {
        Book book = new Book(1, "how to win friends", "Bill gates", SubjectCategory.CHILDREN, new Rack(1,1));
        books.put(1, book);

        Book book1 = new Book(2, "Money", "Bill gates", SubjectCategory.CHILDREN, new Rack(2,2));
        books.put(2, book1);

        Book book2 = new Book(3, "how to win a guy in 90 days", "Bill gates", SubjectCategory.CHILDREN, new Rack(3,3));
        books.put(3, book2);
    }

    //add book
    //search book
    //list boooks



}
