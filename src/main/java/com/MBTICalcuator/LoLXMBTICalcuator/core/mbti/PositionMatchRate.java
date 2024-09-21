package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti;

import java.util.HashMap;
import java.util.Map;

public enum PositionMatchRate {
    TOP("탑"),
    JUNGLE("정글"),
    MID("미드"),
    ADC("원딜"),
    SUPPORT("서폿");

    private final String position;

    PositionMatchRate(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
