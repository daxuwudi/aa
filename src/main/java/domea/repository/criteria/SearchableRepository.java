package domea.repository.criteria;


import domea.criteria.SearchCriteria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SearchableRepository<T> //提供了一组条件
{
    Page<T> search(SearchCriteria searchCriteria, Pageable pageable);
}
