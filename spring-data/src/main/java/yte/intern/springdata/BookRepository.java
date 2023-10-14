package yte.intern.springdata;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.convert.Jsr310Converters.LocalDateToDateConverter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
    Book findByTitle(String title);
    List<Book> findByAgeGreaterThan(Long age,Sort sort);
    List<Book> findByPublishDateAfter(LocalDateTime publishDate, PageRequest pageRequest);
    List<Book> findByTitleContaining(String title);
    List<Book> findByAuthorAndAgeGreaterThan(String author,Long age);
    Long countByAuthor(String author);
    Boolean existsByAuthor(String author);
}
