package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MBTICalculatorService {
    public String calculateScores(List<String> answers, List<Question> questions) {
        Map<MBTIDimension, Integer> scores = new HashMap<>();
        for (int i = 0; i < answers.size(); i++) {
            String answer = answers.get(i);
            Question question = questions.get(i);
            MBTIDimension dimension = MBTIDimension.valueOf(question.getDimension());

            if (answer.equals("A")) {
                scores.put(dimension, scores.getOrDefault(dimension, 0) + 1);
            }
        }

        StringBuilder mbti = new StringBuilder();

        for (MBTIDimension dimension : MBTIDimension.values()) {
            int score = scores.getOrDefault(dimension, 0);
            int totalDimensionQuestions = (int) questions.stream()
                    .filter(question -> MBTIDimension.valueOf(question.getDimension()) == dimension)
                    .count(); // Calculate number of questions for this dimension

            mbti.append(score > (totalDimensionQuestions / 2) ? dimension.getTypeA() : dimension.getTypeB());
        }
        return mbti.toString();
    }
}
