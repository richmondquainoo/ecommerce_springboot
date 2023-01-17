package com.example.ecommerceproject.Category;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private CategoryService categoryService;

    @GetMapping("/getAllCategories")
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @PostMapping("/create-productCategory")
    @ResponseStatus(HttpStatus.CREATED)
    public Category getCategoryService(Category category) {
        return categoryService.saveCategory(category);
    }
}
