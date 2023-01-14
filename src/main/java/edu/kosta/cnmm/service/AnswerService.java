package edu.kosta.cnmm.service;

import edu.kosta.cnmm.domain.Answer;
import edu.kosta.cnmm.repository.AnswerRepository;
import edu.kosta.cnmm.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerService {

    final
    AnswerRepository answerRepository;

    final
    UserRepository userRepository;
    public AnswerService(AnswerRepository answerRepository, UserRepository userRepository) {
        this.answerRepository = answerRepository;
        this.userRepository = userRepository;
    }

    public List<Answer> saveAnswers(List<Answer> answers){
        return answerRepository.saveAll(answers);
    }

    public List<Answer> getAnswersWithUser(Long userId) {
        return  answerRepository.findAllByUser(userRepository.findById(userId).orElseThrow());
    }
}
