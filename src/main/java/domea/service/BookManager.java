package domea.service;

import domea.jpa.entities.Author;
import domea.jpa.entities.Book;
import domea.jpa.entities.Publisher;

import java.util.List;

public interface BookManager {
    List<Author> getAuthors();
    List<Book> getBooks();
    List<Publisher> getPublishes();
    void  saveAuthor(Author author);
    void  saveBook (Book book);
    void savePublisher(Publisher publisher);
}
