package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti;

import lombok.Builder;
import lombok.Getter;


@Getter
public class Character {
    private Long id;
    private String description;
    private String imgSrc;

    @Builder
    public Character(Long id, String description, String imgSrc) {
        this.id = id;
        this.description = description;
        this.imgSrc = imgSrc;
    }
}
