package marcin.springframework.springweb5app.repositories;

import marcin.springframework.springweb5app.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
