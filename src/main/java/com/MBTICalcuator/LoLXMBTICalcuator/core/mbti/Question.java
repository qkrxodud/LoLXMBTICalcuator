package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Question {
    private Long id;
    private String questionText;
    private String dimension; // EI, SN, TF, JP

    @Builder
    public Question(Long id, String questionText, String dimension) {
        this.id = id;
        this.questionText = questionText;
        this.dimension = dimension;
    }
}
