package com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.repository;

import com.MBTICalcuator.LoLXMBTICalcuator.storage.jpa.QuestionJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface QuestionRepository extends JpaRepository<QuestionJpaEntity, Long> {
}