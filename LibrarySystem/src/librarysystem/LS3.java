package librarysystem;

import java.util.ArrayList;
import java.util.Scanner;

public class LS3 {

    public LS3() {
    }
    private String booktitle, author, ISBN, status;
    /// private // لا تستخدم خارج الكلاس اي خاص بكلاس 

    public LS3(String booktitle, String author, String ISBN, String status) {
        this.booktitle = booktitle;
        this.author = author;
        this.ISBN = ISBN;
        this.status = status;

    }

    public String check() {     
        return status;
    }

    public String getbooktitle() {  
        return booktitle;
    }

    public String getauthor() {   
        return author;
    }

    public String ISBNbook() {
        return ISBN;
    }
//////////////////////////////////////////////////////////////////

    public void setstatus(String status) { 
        this.status = status;
    }

    public void set_book_title(String booktitle) {
        this.booktitle = booktitle;
    }

    public void set_author(String author) { 
        this.author = author;
    }

    public void setISBN(String ISBN) {   
        this.ISBN = ISBN;
    }

}
