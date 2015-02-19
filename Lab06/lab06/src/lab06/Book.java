/****************
Bob Rhett - Monday, February 9, 2015
  Class definition for a book.
  Initial release
****************/
package lab06;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String copyrightDate;
    
    /****************
    / Constructor to set up a book with the specified title, author
    /   publisher, and copyright date.
     * @param newTitle
     * @param newAuthor
     * @param newPublisher
     * @param newCopyrightDate
    ****************/
    public Book (String newTitle, String newAuthor, String newPublisher, String newCopyrightDate) {
        title = newTitle;
        author = newAuthor;
        publisher = newPublisher;
        copyrightDate = newCopyrightDate;
    }
    
    //****************
    // Returns the title of this book.
    //****************
    public String getTitle() {
        return title;
    }

    //****************
    // Sets the title of this book.
    //****************
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    //****************
    // Returns the author of this book.
    //****************
    public String getAuthor() {
        return author;
    }

    //****************
    // Sets the author of this book.
    //****************
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    //****************
    // Returns the publisher of this book.
    //****************
    public String getPublisher() {
        return publisher;
    }

    //****************
    // Sets the publisher of this book.
    //****************
    public void setPublisher(String newPublisher) {
        publisher = newPublisher;
    }

    //****************
    // Returns the copyright date of this book.
    //****************
    public String getCopyrightDate() {
        return copyrightDate;
    }

    //****************
    // Sets the copyright date of this book.
    //****************
    public void setCopyrightDate(String newCopyrightDate) {
        copyrightDate = newCopyrightDate;
    }
}
