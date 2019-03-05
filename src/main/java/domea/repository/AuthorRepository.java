package domea.repository;

import domea.jpa.entities.Author;
import org.springframework.data.repository.CrudRepository;
public interface AuthorRepository  extends CrudRepository<Author ,Long> {

}
