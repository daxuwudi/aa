package domea.repository;

import domea.jpa.entities.Book;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Long> {
    Book getOneByIsbn(String isbn);


}
