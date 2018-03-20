package com.tharindu.springframework.recipe.repositories;

import com.tharindu.springframework.recipe.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
