package com.MBTICalcuator.LoLXMBTICalcuator.storage.jpa;

import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.Question;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "question")
@Getter
public class QuestionJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "question_text", nullable = false)
    private String questionText;

    @Column(name = "dimension", nullable = false)
    private String dimension;

    public Question toModel() {
        return Question.builder()
                .id(id)
                .questionText(questionText)
                .dimension(dimension)
                .build();
    }
}
