package com.netcracker.edu.location.service;

import com.netcracker.edu.location.model.Category;
import com.netcracker.edu.location.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Category findCategoryByName(String name) {
        return categoryRepository.findCategoryByName(name);
    }

}
