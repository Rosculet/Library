public class Book {

    String bookName;
    Author author;

    public Book(String bookName, Author author) {
        this.bookName = bookName;
        this.author = author;
    }

    @Override
    public String toString() {
        return " " + author.name + " - " + bookName + " ";
    }
}
