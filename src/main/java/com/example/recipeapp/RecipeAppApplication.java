package com.example.recipeapp;

import com.example.recipeapp.run.Ingredient;
import com.example.recipeapp.run.Recipe;
import com.example.recipeapp.run.RecipeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;
@SpringBootApplication
public class RecipeAppApplication {

    private static final Logger log = LoggerFactory.getLogger(RecipeAppApplication.class);
    public static void main(String[] args) {

        SpringApplication.run(RecipeAppApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(RecipeRepository recipeRepository) {
        return args -> {
            Recipe recipe = new Recipe(2,"Spaghetti", "io", List.of("Italian", "Pasta"), "inn",123, List.of(new Ingredient(1, "Pasta", "200g", 2), new Ingredient(2, "Tomato Sauce", "500g", 1)));
            log.info(recipe.toString());
//            recipeRepository.drop();
       //     recipeRepository.create(recipe);
            List<Recipe> x = recipeRepository.findAll();
            for (Recipe r : x) {
                log.info(r.toString());
            }
        };
    }
}
