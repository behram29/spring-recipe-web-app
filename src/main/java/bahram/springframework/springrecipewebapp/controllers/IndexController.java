package bahram.springframework.springrecipewebapp.controllers;

import bahram.springframework.springrecipewebapp.domain.Category;
import bahram.springframework.springrecipewebapp.domain.UnitOfMeasure;
import bahram.springframework.springrecipewebapp.repositories.CategoryRepository;
import bahram.springframework.springrecipewebapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category ID: " + categoryOptional.get().getId());
        System.out.println("UnitOfMeasure ID: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
