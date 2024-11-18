package Repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Models.Book;
import Models.Member;

public class LoanRepository {
    //simple map of user and list of books

    private Map<Member, List<Book>> loans = new HashMap<Member, List<Book>>();

    //Loan
    public void loanBook(Book book)
    {
        //search in library repository if the book is available
        //if yes, add to the loans
        //if No, return error
    }


}
