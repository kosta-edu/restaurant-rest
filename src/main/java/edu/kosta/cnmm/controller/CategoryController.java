package edu.kosta.cnmm.controller;

import edu.kosta.cnmm.domain.Category;
import edu.kosta.cnmm.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    final
    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getList() {
        return categoryService.findAll();
    }

    @PostMapping
    public Category setCategory(@RequestBody Category category) {
        return categoryService.saveCategory(category);
    }

    @DeleteMapping("/{id}")
    public void deleteCook(@PathVariable("id") long id) {
        Category category = categoryService.findById(id).orElseThrow(NoSuchElementException::new);
        categoryService.deleteCategory(category);
    }
}
