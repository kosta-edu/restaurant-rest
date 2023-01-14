package edu.kosta.cnmm.controller;

import edu.kosta.cnmm.domain.Category;
import edu.kosta.cnmm.domain.Quiz;
import edu.kosta.cnmm.service.CategoryService;
import edu.kosta.cnmm.service.QuizService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/quizzes")
public class QuizController {

    final
    QuizService quizService;

    final
    CategoryService categoryService;

    public QuizController(QuizService quizService, CategoryService categoryService) {
        this.quizService = quizService;
        this.categoryService = categoryService;
    }

    @GetMapping({"/search", "search?category={category}"})
    public Optional<Quiz> getQuizzes(@RequestParam(value = "category", required = false, defaultValue = "1") long categoryId) {
        Category category = categoryService.findById(categoryId).orElseThrow(NoSuchElementException::new);
        return quizService.getQuizzesWithCategory(category);
    }
}
