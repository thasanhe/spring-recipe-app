package com.tharindu.springframework.recipe.repositories;

import com.tharindu.springframework.recipe.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
