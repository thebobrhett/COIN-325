/****************
Bob Rhett - Monday, February 9, 2015
  Class to define a bookshelf.
  Initial release
****************/
package lab06;

public class BookShelf {
    private String[] slot = new String[6];
    private final int slots = 5;

    /****************
    / Constructor to set up a bookshelf with empty slots.
    ****************/
    public BookShelf () {
    }
    
    //****************
    // Gets the title of the book in the specified slot.
    //****************
    public String getSlot(int mySlot) {
        return slot[mySlot];
    }

    //****************
    // Sets the title of the book in the specified slot.
    //****************
    public void setSlot(int mySlot, String newTitle) {
        slot[mySlot] = newTitle;
    }

    //****************
    // Removes the book in the specified slot.
    //****************
    public void setEmpty(int mySlot) {
        slot[mySlot] = null;
    }

    //****************
    // Counts the number of books currently in the bookshelf.
    //****************
    public int numBooks() {
        int bookCount = 0;
        
        for (int currSlot = 1; currSlot <= slots; currSlot++)
            if (slot[currSlot] != null)
                bookCount++;
                                
        return bookCount;
    }
}