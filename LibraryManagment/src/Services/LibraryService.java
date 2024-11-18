package Services;

import Models.Book;
import Repositories.LibraryRepository;
import Repositories.LoanRepository;

public class LibraryService {
    private LibraryRepository libraryRepository;
    private LoanRepository loanRepository;

    public LibraryService(LibraryRepository libraryRepository, LoanRepository loanRepository) {
        this.libraryRepository = libraryRepository;
        this.loanRepository = loanRepository;
    }

    public void borrowBooks(Book book)
    {
        //reponsibilty of service layer is also to check if the book is available in the repository
        //Not just directly call the repo method loan book
        //2. passing entier book in the parameter is not claner and best way to write the id
        //you should pass the id, and on repo , find the book from the book repo and use that identifier to loan

        //3. handle the return of the loanBok, if the book wasnt available, handle that error properly and give error to the user
        //4. it is responsibilty if the service layer to update Library repository and loan repository correctly

        //Take Away is the below:

        /// 1. Repositories should focus only on CRUD (Create, Read, Update, Delete) operations for their respective datasets.
        /// 2. The service layer should manage the workflows and rules that span multiple repositories.

        loanRepository.loanBook(book);
    }
}
