package bahram.springframework.springrecipewebapp.controllers;

import bahram.springframework.springrecipewebapp.domain.Category;
import bahram.springframework.springrecipewebapp.domain.UnitOfMeasure;
import bahram.springframework.springrecipewebapp.repositories.CategoryRepository;
import bahram.springframework.springrecipewebapp.repositories.UnitOfMeasureRepository;
import bahram.springframework.springrecipewebapp.service.RecipeService;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
