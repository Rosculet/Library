import java.util.List;
import java.util.Set;

public class User {

    /*
    метод getMyBooksOnHand позволяет отследить количество книг у данного пользователя
     */
    String name;
    Set<Book> onHand;

    public User(String name, Set<Book> onHand) {
        this.name = name;
        this.onHand = onHand;
    }

    public void getMyBooksOnHand() {
        System.out.println(onHand);
    }

    @Override
    public String toString() {

        return " " + name + " ";
    }
}
