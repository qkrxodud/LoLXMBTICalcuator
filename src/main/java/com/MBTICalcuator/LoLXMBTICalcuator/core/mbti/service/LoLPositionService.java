package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.service;

import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.LoLPosition;
import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.LoLPositions;
import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.repository.LoLPositionRepository;
import com.MBTICalcuator.LoLXMBTICalcuator.storage.jpa.LOLPositionJpaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LoLPositionService {
    private final LoLPositionRepository loLPositionRepository;

    @Cacheable(value = "lolPositionsCache", unless = "#result == null || #result.isEmpty()")
    public LoLPositions getLoLPositionsDescription() {
        List<LoLPosition> loLPositionList = loLPositionRepository.findAll()
                .stream()
                .map(LOLPositionJpaEntity::toModel)
                .collect(Collectors.toList());

        return new LoLPositions(loLPositionList);
    }
}
