package edu.kosta.cnmm.service;

import edu.kosta.cnmm.domain.Category;
import edu.kosta.cnmm.domain.Quiz;
import edu.kosta.cnmm.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuizService {

    final
    QuizRepository quizRepository;

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public Optional<Quiz> getQuizzesWithCategory(Category category) {
        return this.quizRepository.findAllByCategoryAndLevelEquals(category, 1);
    }
}
