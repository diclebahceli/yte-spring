package yte.intern.springdata;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringDataApplication.class, args);
		BookRepository bookRepository = context.getBean(BookRepository.class);

		List<Book> books = new ArrayList<>();
		books.add(new Book(null, "The Lord of the Rings", "J.R.R. Tolkien", 18L, LocalDateTime.now()));
		books.add(new Book(null, "The Hobbit", "J.R.R. Tolkien", 18L, LocalDateTime.now()));
		books.add(new Book(null, "The Silmarillion", "J.R.R. Tolkien",13L, LocalDateTime.now()));
		books.add(new Book(null, "The Children of Hurin", "J.R.R. Tolkien", 20L, LocalDateTime.now()));
		books.add(new Book(null, "The Fall of Gondolin", "J.R.R. Tolkien", 8L, LocalDateTime.now()));
		books.add(new Book(null, "The Adventures of Tom Bombadil", "J.R.R. Tolkien", 1L, LocalDateTime.now()));
		books.add(new Book(null, "The Road Goes Ever On", "J.R.R. Tolkien", 19L, LocalDateTime.now()));
		books.add(new Book(null, "The Father Christmas Letters", "J.R.R. Tolkien", 1L, LocalDateTime.now()));
		books.add(new Book(null, "The Letters of J.R.R. Tolkien", "J.R.R. Tolkien", 16L, LocalDateTime.now()));
		books.add(new Book(null, "The Monsters and the Critics", "Jsdkflskf", 16L, LocalDateTime.now()));

		bookRepository.saveAll(books);


		// System.out.println(bookRepository.findByTitle("The Hobbit"));
		// System.out.println(bookRepository.findByAgeGreaterThan(15L, Sort.by("age").ascending()));
		// System.out.println(bookRepository.findByPublishDateAfter(LocalDateTime.parse("2000-01-01T00:00"),PageRequest.of(1, 5))+"AAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		// System.out.println(bookRepository.findByTitleContaining("the"));
		//System.out.println(bookRepository.findByAuthorAndAgeGreaterThan("Jsdkflskf", 15L));
		 //System.out.println(bookRepository.countByAuthor("Jsdkflskf"));
		 System.out.println(bookRepository.existsByAuthor("Jsdkflskf"));
	}	



}
