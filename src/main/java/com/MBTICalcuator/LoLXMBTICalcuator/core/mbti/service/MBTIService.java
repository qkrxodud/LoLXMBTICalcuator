package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.service;

import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MBTIService {
    private final MBTICalculatorService mbtiCalculatorService;
    private final LoLPositionCalculatorService loLPositionCalculatorService;


    public String getMBTI(final List<String> answer, List<Question> questions) {
        return mbtiCalculatorService.calculateScores(answer, questions);
    }

    public PositionMatchRate matchLolResults(final String mbti) {
        return loLPositionCalculatorService.getPositionMatchRates(mbti);
    }

}
