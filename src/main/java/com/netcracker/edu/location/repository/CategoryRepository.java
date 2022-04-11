package com.netcracker.edu.location.repository;

import com.netcracker.edu.location.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

    Category findCategoryByName(String name);
}
