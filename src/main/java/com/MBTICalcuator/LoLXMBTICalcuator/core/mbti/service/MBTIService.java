package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.service;

import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.*;
import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.repository.*;
import com.MBTICalcuator.LoLXMBTICalcuator.storage.jpa.QuestionJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MBTIService {
    private final QuestionRepository questionRepository;
    private final MBTICalculatorService mbtiCalculatorService;
    private final LoLPositionCalculatorService loLPositionCalculatorService;


    public String getMBTI(final List<String> answer) {
        List<Question> questions = questionRepository.findAll()
                .stream()
                .map(QuestionJpaEntity::toModel)
                .collect(Collectors.toList());

        return mbtiCalculatorService.calculateScores(answer, questions);
    }

    public PositionMatchRate matchLolResults(final String mbti) {
        return loLPositionCalculatorService.getPositionMatchRates(mbti);
    }

}
