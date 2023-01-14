package edu.kosta.cnmm.repository;

import edu.kosta.cnmm.domain.Answer;
import edu.kosta.cnmm.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    List<Answer> findAllByUser(User user);
}
