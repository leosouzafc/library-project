@Entity
public class Book{
    private String title;
    private String author;
    private String isbn; //Funciona como identificador único
    private String category;

    public Book(String title, String author, String isbn, int category) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category= category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getCategory() {
        return category;
    }
}