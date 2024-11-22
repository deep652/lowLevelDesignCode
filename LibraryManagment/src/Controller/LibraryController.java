package Controller;

import Models.Book;
import Models.Member;
import Services.LibraryService;

public class LibraryController {
    private LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void borrowBook(Member member, Book book)
    {
        libraryService.borrowBooks(member, book);
        System.out.println("book issued");

    }
}
