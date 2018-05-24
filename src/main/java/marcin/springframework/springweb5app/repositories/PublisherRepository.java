package marcin.springframework.springweb5app.repositories;

import marcin.springframework.springweb5app.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
