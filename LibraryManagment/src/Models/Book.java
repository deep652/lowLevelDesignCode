package Models;

import java.util.Date;

public class Book {
        private int id;
        private String title;
        private String author;
        private SubjectCategory category;
        private Date publicationDate;
        private Rack rackNo;

        public Book(String title) {
                this.title = title;
        }

        public Book(int id, String title, String author, SubjectCategory category, Rack rackNo) {
                this.id = id;
                this.title = title;
                this.author = author;
                this.category = category;
                this.rackNo = rackNo;
        }
}
