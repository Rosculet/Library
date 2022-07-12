import java.util.List;
import java.util.Set;

public class Author  {

     public String name;
     public Set bookList;

     public Author(String name, Set<Book> bookList) {
          this.name = name;
          this.bookList = bookList;
     }

    public void setBookList(Book book){
          bookList.add(book);
     }

     @Override
     public String toString() {
          return name;
     }
}
