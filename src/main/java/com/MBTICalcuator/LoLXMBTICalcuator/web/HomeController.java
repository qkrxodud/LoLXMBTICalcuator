package com.MBTICalcuator.LoLXMBTICalcuator.web;

import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.PositionMatchRate;
import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.service.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final QuestionService questionService;
    private final MBTIService MBTIService;
    private final LoLPositionService loLPositionService;
    private final CharacterService characterService;
    @GetMapping("/")
    public ModelAndView homeQuestions() {
        ModelAndView modelAndView = new ModelAndView("questions.html"); // 뷰 이름 설정
        List<Question> questions = questionService.findAllQuestion();
        modelAndView.addObject("questions", questions);
        modelAndView.addObject("characters_img", characterService.getCharacters());
        return modelAndView;  // questions.html로 이동
    }

    @GetMapping("/questions")
    public ModelAndView showQuestions() {
        ModelAndView modelAndView = new ModelAndView("questions.html"); // 뷰 이름 설정
        List<Question> questions = questionService.findAllQuestion();
        modelAndView.addObject("questions", questions);
        modelAndView.addObject("characters_img", characterService.getCharacters());
        return modelAndView;  // questions.html로 이동
    }

    @PostMapping("/submitAnswers")
    public ModelAndView submitAnswers(@RequestParam Map<String, String> answers, Model model) {
        ModelAndView modelAndView = new ModelAndView("result.html"); // 뷰 이름 설정
        List<String> answerList = new ArrayList<>();
        for (String key : answers.keySet()) {
            answerList.add(answers.get(key)); // 각 질문의 답변을 리스트에 추가
        }

        String mbti = MBTIService.getMBTI(answerList);
        PositionMatchRate positionMatchRate = MBTIService.matchLolResults(mbti);
        modelAndView.addObject("mbtiType", mbti);
        modelAndView.addObject("bestPosition", positionMatchRate);
        modelAndView.addObject("LoLPositionDescription", loLPositionService.getLoLPositionDescription(positionMatchRate));
        return modelAndView;
    }


    @GetMapping("/share/{mbti}")
    public ModelAndView shareMBTIResult(@PathVariable("mbti") String mbti) {
        ModelAndView modelAndView = new ModelAndView("result.html"); // 뷰 이름 설정
        PositionMatchRate positionMatchRate = MBTIService.matchLolResults(mbti);
        modelAndView.addObject("mbtiType", mbti);
        modelAndView.addObject("bestPosition", positionMatchRate);
        modelAndView.addObject("LoLPositionDescription", loLPositionService.getLoLPositionDescription(positionMatchRate));
        return modelAndView;
    }

}
