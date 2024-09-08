package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.service;

import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.Question;
import com.MBTICalcuator.LoLXMBTICalcuator.storage.jpa.QuestionJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.repository.*;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> findAllQuestion() {
        List<QuestionJpaEntity> all = questionRepository.findAll();
        return all.stream()
                .map(QuestionJpaEntity::toModel)
                .collect(Collectors.toList());
    }


}
