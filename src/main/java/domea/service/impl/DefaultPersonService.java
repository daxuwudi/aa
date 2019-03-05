package domea.service.impl;


import domea.criteria.SearchCriteria;
import domea.jpa.entities.Person;
import domea.repository.criteria.PersonRepository;
import domea.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class DefaultPersonService implements PersonService
{
    @Autowired
    PersonRepository repository;

    @Override
    @Transactional
    public void savePerson(Person person)
    {
        this.repository.save(person);
    }

    @Override
    @Transactional
    public Page<Person> searchPeople(SearchCriteria searchCriteria, Pageable pageable)
    {
        return this.repository.search(searchCriteria, pageable);
    }
}