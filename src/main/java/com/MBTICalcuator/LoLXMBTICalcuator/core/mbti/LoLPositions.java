package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti;

import lombok.Getter;

import java.util.List;

@Getter
public class LoLPositions {
    private List<LoLPosition> loLPositions;

    public LoLPositions(List<LoLPosition> loLPositions) {
        this.loLPositions = loLPositions;
    }

    public LoLPosition getLolPositionDescription(PositionMatchRate positionMatchRate) {
         return loLPositions.stream()
                .filter(loLPosition -> loLPosition.getPositionMatchRate()
                        .equals(positionMatchRate))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("포지션을 찾을수 없습니다."));
    }
}
