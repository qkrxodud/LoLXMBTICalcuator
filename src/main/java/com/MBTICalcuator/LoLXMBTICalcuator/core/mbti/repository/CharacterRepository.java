package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.repository;

import com.MBTICalcuator.LoLXMBTICalcuator.storage.jpa.CharacterJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterJpaEntity, Long> {
}
