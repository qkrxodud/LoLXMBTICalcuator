package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class Question implements Serializable {
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
