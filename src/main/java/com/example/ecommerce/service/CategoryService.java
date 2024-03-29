package com.example.ecommerce.service;

import com.example.ecommerce.entities.Category;
import com.example.ecommerce.repository.category.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }
}
