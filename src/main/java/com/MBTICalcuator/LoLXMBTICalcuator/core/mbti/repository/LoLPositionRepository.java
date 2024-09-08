package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.repository;

import com.MBTICalcuator.LoLXMBTICalcuator.storage.jpa.LOLPositionJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoLPositionRepository extends JpaRepository<LOLPositionJpaEntity, Long> {
}
