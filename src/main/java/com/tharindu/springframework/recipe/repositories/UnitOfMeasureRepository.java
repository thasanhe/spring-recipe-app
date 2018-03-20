package com.tharindu.springframework.recipe.repositories;

import com.tharindu.springframework.recipe.models.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
