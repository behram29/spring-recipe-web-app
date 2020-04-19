package bahram.springframework.springrecipewebapp.repositories;

import bahram.springframework.springrecipewebapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
