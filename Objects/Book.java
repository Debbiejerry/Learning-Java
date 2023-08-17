package Objects;

public class Book {
    private String title; // private attribute to store the book's title
    private String author; // private attribute to store the book's author
    
    // Getter for title
    public String getTitle() {
        return title;
    }
    
    // Setter for title
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    
    // Getter for author
    public String getAuthor() {
        return author;
    }
    
    // Setter for author
    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("The Great Gatsby");
        book1.setAuthor("F. Scott Fitzgerald");
        
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
    }
}

