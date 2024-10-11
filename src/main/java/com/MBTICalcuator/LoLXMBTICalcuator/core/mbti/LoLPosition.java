package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class LoLPosition implements Serializable {
    private Long id;
    private PositionMatchRate positionMatchRate;
    private String imgSrc;
    private String description;

    @Builder
    public LoLPosition(Long id, PositionMatchRate positionMatchRate, String imgSrc, String description) {
        this.id = id;
        this.positionMatchRate = positionMatchRate;
        this.imgSrc = imgSrc;
        this.description = description;
    }
}
