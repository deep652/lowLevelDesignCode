import Controller.LibraryController;
import Models.Book;
import Models.Member;
import Repositories.LibraryRepository;
import Repositories.LoanRepository;
import Services.LibraryService;

class LibraryManagmentApplication
{
    public static void main(String[] args)
    {
        LibraryRepository libraryRepository = new LibraryRepository();
        LoanRepository loanReporitory = new LoanRepository();
        LibraryService service = new LibraryService(libraryRepository, loanReporitory);
        LibraryController controller = new LibraryController(service);

        Book book = new Book("stl");
        Member member = new Member("ashish", 1);
        System.out.println("Issuing book " + book.toString() + " to " + member.toString());

    }
}