package edu.kosta.cnmm.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@Builder
public class AnswerInsertRequest {

    @NotNull
    private String answer;
    @NotNull
    private Long quizId;
    @NotNull
    private Long userId;

}
