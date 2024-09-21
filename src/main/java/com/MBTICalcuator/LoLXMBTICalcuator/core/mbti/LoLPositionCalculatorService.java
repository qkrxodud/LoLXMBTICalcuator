package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class LoLPositionCalculatorService {
    public PositionMatchRate getPositionMatchRates(String mbti) {
        return determineBestPosition(mbti); // mbti에 따른 포지션 결정 로직
    }

    private PositionMatchRate determineBestPosition(String mbti) {
        // 포지션별로 매칭되는 MBTI 목록을 정의합니다.
        Map<PositionMatchRate, List<String>> mbtiMapping = new HashMap<>();

        mbtiMapping.put(PositionMatchRate.TOP, Arrays.asList("ISTJ", "ESTJ", "INTJ"));
        mbtiMapping.put(PositionMatchRate.JUNGLE, Arrays.asList("ENFP", "ESFP", "ENTP", "ISTP"));
        mbtiMapping.put(PositionMatchRate.MID, Arrays.asList("INTP", "ENTJ"));
        mbtiMapping.put(PositionMatchRate.ADC, Arrays.asList("ISFP", "ESFJ", "ESTP"));
        mbtiMapping.put(PositionMatchRate.SUPPORT, Arrays.asList("INFJ", "ISFJ", "ENFJ", "INFP"));

        // MBTI 값이 어떤 포지션에 해당하는지 확인합니다.
        return mbtiMapping.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(mbti))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("MBTI 값을 찾을수 없습니다."));
    }
}
