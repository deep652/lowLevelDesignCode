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
    public void loanBook(Member member, Book book)
    {
        //search in library repository if the book is available
        //if yes, add to the loans
        //if No, return error

        //Note: the above comment is not relevant here, you shouldn't search the book here
        // that is the responsibilty of the service
        //Repos are only responsibile for CRUD operation

        List<Book> list = loans.get(member);
        list.add(book);

    }


}
