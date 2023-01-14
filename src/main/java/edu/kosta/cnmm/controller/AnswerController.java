package edu.kosta.cnmm.controller;

import edu.kosta.cnmm.domain.Answer;
import edu.kosta.cnmm.domain.Quiz;
import edu.kosta.cnmm.dto.AnswerInsertRequest;
import edu.kosta.cnmm.mapper.AnswerMapper;
import edu.kosta.cnmm.service.AnswerService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/answers")
public class AnswerController {

    final
    AnswerService answerService;

    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping("/cal")
    public List<Answer> calculateAnswer(){

        List<Answer> result = answerService.getAnswersWithUser(1L);

        for (Answer answer: result) {
            Quiz quiz = answer.getQuiz();
            if(quiz.getChildren().isEmpty()) answer.setResult(Objects.equals(answer.getAnswer(), "yes") ?5:0);
        }
        calculateSubAnswer(result, 4);
        calculateSubAnswer(result, 3);
        calculateSubAnswer(result, 2);
        calculateSubAnswer(result, 1);

        return answerService.saveAnswers(result);
    }

    private void calculateSubAnswer(List<Answer> answers, int level) {
        for (Answer answer: answers) {
            Quiz quiz = answer.getQuiz();
            int count = quiz.getChildren().size();
            double temp = 0d;
            if(!quiz.getChildren().isEmpty()&&quiz.getLevel()==4) {
                for (Quiz quiz1 : quiz.getChildren()){
                    temp += (answers.stream()
                            .filter(answer1 -> quiz1.getId()==answer1.getQuiz().getId())
                            .map(Answer::getResult)
                            .reduce(0D, Double::sum));
                }
            }
            answer.setResult(temp);
        }
    }

    @PostMapping
    public List<Answer> saveAnswers(@Valid @RequestBody List<AnswerInsertRequest> requests){
        List<Answer> answers = new ArrayList<>();
        for (AnswerInsertRequest request : requests) {
            answers.add(AnswerMapper.INSTANCE.insertRequestToAnswers(request));
        }

        return answerService.saveAnswers(answers);
    }
}
