package marcin.springframework.springweb5app.repositories;

import marcin.springframework.springweb5app.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
