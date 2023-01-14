package edu.kosta.cnmm.mapper;

import edu.kosta.cnmm.domain.Answer;
import edu.kosta.cnmm.dto.AnswerInsertRequest;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnswerMapper {

    AnswerMapper INSTANCE = Mappers.getMapper( AnswerMapper.class );
    @Mapping(target = "quiz.id", source = "quizId")
    @Mapping(target = "user.id", source = "userId")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    Answer insertRequestToAnswers(AnswerInsertRequest request);
}
