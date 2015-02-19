/****************
Bob Rhett - Monday, February 9, 2015
  JUnit Tester for BookShelf program.
  Initial release
****************/

import lab06.Book;
import lab06.BookShelf;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookShelfTester {
    Book book1 = new Book("Java Foundations", "John Lewis", "Addison Wesley", "2011");
    Book book2 = new Book("Charleston Then and Now", "Robert Rhett", "Sandlapper Publishing", "2005");
    Book book3 = new Book("Java Foundations", "John Lewis", "Addison Wesley", "2011");
    Book book4 = new Book("Java Foundations", "John Lewis", "Addison Wesley", "2011");
    Book book5 = new Book("Java Foundations", "John Lewis", "Addison Wesley", "2011");
    BookShelf bookshelf1 = new BookShelf();

    public BookShelfTester() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    // Test a new (empty) bookshelf.
    public void testConstructor() {
        assertTrue(0 == bookshelf1.numBooks());
    }
    
    @Test
    // Test a full bookshelf.
    public void testFullBookshelf() {
        bookshelf1.setSlot(1, book1.getTitle());
        bookshelf1.setSlot(2, book2.getTitle());
        bookshelf1.setSlot(3, book3.getTitle());
        bookshelf1.setSlot(4, book4.getTitle());
        bookshelf1.setSlot(5, book5.getTitle());
        assertTrue(5 == bookshelf1.numBooks());
    }
    
    @Test
    //Test the book setters and getters.
    public void testBookSetGet() {
        assertTrue("Robert Rhett".equals(book2.getAuthor()));
        book2.setAuthor("Bob Rhett");
        assertTrue("Bob Rhett".equals(book2.getAuthor()));
    }
    
    @Test
    //Test the bookshelf setters and getters.
    public void testBookshelfSetGet() {
        bookshelf1.setSlot(1, book1.getTitle());
        bookshelf1.setSlot(2, book2.getTitle());
        bookshelf1.setSlot(3, book3.getTitle());
        bookshelf1.setSlot(4, book4.getTitle());
        bookshelf1.setSlot(5, book5.getTitle());
        assertTrue("Charleston Then and Now".equals(bookshelf1.getSlot(2)));
        bookshelf1.setSlot(2, "Charleston Now and Then");
        assertTrue("Charleston Now and Then".equals(bookshelf1.getSlot(2)));
        bookshelf1.setSlot(2, book2.getTitle());
        assertTrue("Charleston Then and Now".equals(bookshelf1.getSlot(2)));
    }
    
    @Test
    //Test emptying a slot in the bookshelf and counting the number of books.
    public void testBookshelfNumBooks() {
        bookshelf1.setSlot(1, book1.getTitle());
        bookshelf1.setSlot(2, book2.getTitle());
        bookshelf1.setSlot(3, book3.getTitle());
        bookshelf1.setSlot(4, book4.getTitle());
        bookshelf1.setSlot(5, book5.getTitle());
        assertTrue(5 == bookshelf1.numBooks());
        bookshelf1.setEmpty(5);
        assertTrue(4 == bookshelf1.numBooks());
    }
    
    @Test
    //Test a bookshelf that has been emptied.
    public void testEmpty() {
        bookshelf1.setEmpty(1);
        bookshelf1.setEmpty(2);
        bookshelf1.setEmpty(3);
        bookshelf1.setEmpty(4);
        bookshelf1.setEmpty(5);
        assertTrue(0 == bookshelf1.numBooks());
    }
}
