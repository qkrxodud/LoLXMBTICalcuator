package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class LoLPositionCalculatorService {
    public PositionMatchRate getPositionMatchRates(String mbti) {
        return determineBestPosition(mbti); // mbti에 따른 포지션 결정 로직
    }

    private PositionMatchRate determineBestPosition(String mbti) {
        // MBTI 값에 따라 가장 적합한 포지션을 결정하는 로직을 구현합니다.
        // 예시:
        switch (mbti) {
            case "ISTJ":
            case "ESTJ":
            case "INTJ":
                return PositionMatchRate.TOP; // 탑

            case "ENFP":
            case "ESFP":
            case "ENTP":
                return PositionMatchRate.JUNGLE; // 정글

            case "INTP":
            case "ENTJ":
                return PositionMatchRate.MID; // 미드

            case "ISFP":
            case "ESFJ":
            case "ESTP":
                return PositionMatchRate.ADC; // 원딜

            case "INFJ":
            case "ISFJ":
            case "ENFJ":
            case "INFP":
                return PositionMatchRate.SUPPORT; // 서폿

            default:
                return null; // 잘못된 MBTI일 경우 null 리턴
        }
    }
}
