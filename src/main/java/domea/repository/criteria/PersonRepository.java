package domea.repository.criteria;


import domea.jpa.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>,
        SearchableRepository<Person>
{
}

