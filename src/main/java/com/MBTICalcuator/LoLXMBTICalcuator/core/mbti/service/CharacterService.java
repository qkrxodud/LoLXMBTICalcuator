package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.service;

import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.Character;
import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.Characters;
import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.repository.CharacterRepository;
import com.MBTICalcuator.LoLXMBTICalcuator.storage.jpa.CharacterJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    public List<String> getCharacters() {
        List<CharacterJpaEntity> characterJpaEntities = characterRepository.findAll();
        List<Character> characters = characterJpaEntities.stream()
                .map(characterJpaEntity -> characterJpaEntity.toModel())
                .collect(Collectors.toList());

        return new Characters(characters)
                .getCharacterImgSrc();
    }

}
