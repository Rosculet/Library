import java.util.*;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Jack London", new HashSet<>());
        Author author2 = new Author("Leo Tolstoy",new HashSet<>());
        Author author3 = new Author("William Shakespeare",new HashSet<>());

        Book book6 = new Book("R and J",author3);
        Book book7 = new Book("Hamlet",author3);
        author3.setBookList(book6);
        author3.setBookList(book7);

        Book book1 = new Book("Sea Wolf",author1);
        Book book2 = new Book("Martin Iden",author1);
        Book book3 = new Book("Moby Dick",author1);
        Book book4 = new Book("War and Peace",author2);
        Book book5 = new Book("Anna Karenina",author2);

        author1.setBookList(book1);
        author1.setBookList(book2);
        author1.setBookList(book3);
        author2.setBookList(book4);
        author2.setBookList(book5);

        Bibliothek bibliothek = new Bibliothek(new HashMap<>());
        bibliothek.addAuthor(author1);
        bibliothek.addAuthor(author2);
        bibliothek.addAuthor(author3);
        System.out.println(bibliothek);

        User user1 = new User("Ivan", new HashSet<>());
        User user2 = new User("Alex", new HashSet<>());
        bibliothek.giveBook(user1, book1);
        bibliothek.giveBook(user1, book2);
        bibliothek.giveBook(user1, book3);
        bibliothek.returnBook(user1,book3);
        bibliothek.giveBook(user2,book5);

        System.out.println(bibliothek.allBooksandUsersOnHand);
        bibliothek.showUsersWithBooks();












    }
}
