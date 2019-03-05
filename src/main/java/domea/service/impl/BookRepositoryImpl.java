package domea.service.impl;


import domea.jpa.entities.Author;
import domea.jpa.entities.Book;
import domea.jpa.entities.Publisher;
import domea.repository.AuthorRepository;
import domea.repository.BookRepository;
import domea.service.BookManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookRepositoryImpl implements BookManager {
    @Autowired
    public AuthorRepository authorRepository;
    @Autowired
    public BookRepository bookRepository;



    @Override
    public List<Author> getAuthors() {
        return this.toList(this.authorRepository.findAll());
    }
    private <E> List<E> toList(Iterable<E> i)
    {
        List<E> list = new ArrayList<>();
        i.forEach(list::add);
        return list;
    }

    @Override
    public List<Book> getBooks() {
        return this.toList(this.bookRepository.findAll());
    }


    @Override
    public List<Publisher> getPublishes() {
        return null;
    }

    @Override
    public void saveAuthor(Author author) {

    }



    @Override
    public void saveBook(Book book) {

    }

    @Override
    public void savePublisher(Publisher publisher) {

    }

}
