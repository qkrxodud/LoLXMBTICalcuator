package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti;

import java.util.List;
import java.util.stream.Collectors;

public class Characters {
    private final List<Character> characterList;

    public Characters(List<Character> characterList) {
        this.characterList = characterList;
    }

    public List<String> getCharacterImgSrc() {
        return characterList.stream()
                .map(character -> character.getImgSrc())
                .collect(Collectors.toList());

    }
}
