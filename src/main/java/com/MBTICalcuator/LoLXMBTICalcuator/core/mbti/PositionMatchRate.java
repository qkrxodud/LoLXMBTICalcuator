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

    // 각 포지션에 대한 매칭률을 반환하는 메서드
    public Map<String, Double> getMatchRates(PositionMatchRate position) {
        Map<String, Double> rates = new HashMap<>();

        if (this == TOP) {
            rates.put("ISTJ", 0.90);
            rates.put("ESTJ", 0.85);
            rates.put("INTJ", 0.80);
            return rates;
        }

        if (this == JUNGLE) {
            rates.put("ENFP", 0.90);
            rates.put("ESFP", 0.85);
            rates.put("ENTP", 0.80);
            return rates;
        }

        if (this == MID) {
            rates.put("INTP", 0.88);
            rates.put("INFJ", 0.85);
            rates.put("ENTJ", 0.83);
            return rates;
        }

        if (this == ADC) {
            rates.put("ISFP", 0.87);
            rates.put("ESFJ", 0.83);
            rates.put("ESTP", 0.80);
            return rates;
        }

        if (this == SUPPORT) {
            rates.put("INFJ", 0.90);
            rates.put("ISFJ", 0.88);
            rates.put("ENFJ", 0.85);
            return rates;
        }

        return rates; // 기본
    }

    public String getPosition() {
        return position;
    }
}
