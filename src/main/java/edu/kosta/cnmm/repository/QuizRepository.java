package edu.kosta.cnmm.repository;

import edu.kosta.cnmm.domain.Category;
import edu.kosta.cnmm.domain.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface QuizRepository extends JpaRepository<Quiz, Long> {
    List<Quiz> findAllByCategory(Category category);

    Optional<Quiz> findAllByCategoryAndLevelEquals(Category category, int level);
}
