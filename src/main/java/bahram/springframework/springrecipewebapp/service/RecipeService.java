package bahram.springframework.springrecipewebapp.service;

import bahram.springframework.springrecipewebapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
