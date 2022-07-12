import java.util.*;

/*
В данном классе реализован функционал схожий с работой обычной библиотеки.
Выбранные структуру данных - Set и HashMap, позволяющие нам осуществлять быстрый поиск с Runtime Complexity O(1),
не наплодить при этом клонов и дубликатов, а так же привязывать значения к ключу.
Реализовал следующие методы которые пришли в голову:
showUsersWithBooks - показать список пользователей у которых на руках книги
checkIfBookAvailable - проверить если книга находится в наличии
giveBook - выдать книгу пользователю
returnBook - возврат книги в библиотеку


 */

public class Bibliothek {

 Map<Book,User> allBooksandUsersOnHand = new HashMap<>();
 Map<String, Set> allBooksWeHave;


 public Bibliothek (Map<String, Set> allBooksWeHave){
  this.allBooksWeHave = allBooksWeHave;
 }

 public void addAuthor(Author author) {
  allBooksWeHave.put(author.name, author.bookList);
 }
 public void showUsersWithBooks(){
  Set users  = new HashSet();
  for (Map.Entry<Book, User> bookUserEntry : allBooksandUsersOnHand.entrySet()) {
   users.add(bookUserEntry.getValue());
  }
  System.out.println(users);
 }

 public boolean checkIfBookAvailable(Book book){
  if (allBooksandUsersOnHand.containsKey(book)) {
   System.out.println("The book is not available");
  return false;}
  else {
   System.out.println("The book is available");
   return true;
  }
 }

 public void giveBook (User user, Book book) {
  if (checkIfBookAvailable(book)) {
   user.onHand.add(book);
   allBooksandUsersOnHand.put(book, user);
   System.out.println("The book " + book.author + " " + book.bookName + " is given to: " + user.name);
  }
  else {
   System.out.println("Sorry the book is not available");
  }
 }
 public void returnBook (User user, Book book){
  user.onHand.remove(book);
  allBooksandUsersOnHand.remove(book,user);
  System.out.println(user.name + " returned " + "the book: " + book.author + " - " + book.bookName + " | this book is available again");
 }

 @Override
 public String toString() {
  return allBooksWeHave.entrySet().toString();
 }
}