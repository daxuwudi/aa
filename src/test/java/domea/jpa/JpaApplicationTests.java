package domea.jpa;

import domea.repository.BookRepository;
import domea.service.BookManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {
  @Autowired
  public BookManager bookManager;

 @Test
  public void contextLoads() {
//      bookRepository.pageQuery(2).forEach(System.out::println);

     bookManager.getAuthors().forEach(System.out::println);
  }

}

