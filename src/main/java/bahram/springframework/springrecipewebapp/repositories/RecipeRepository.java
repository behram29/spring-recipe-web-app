package bahram.springframework.springrecipewebapp.repositories;

import bahram.springframework.springrecipewebapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
