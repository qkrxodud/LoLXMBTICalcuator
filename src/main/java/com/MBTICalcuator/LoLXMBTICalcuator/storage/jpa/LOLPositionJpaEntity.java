package com.MBTICalcuator.LoLXMBTICalcuator.storage.jpa;

import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.LoLPosition;
import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.PositionMatchRate;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "lol_position")
public class LOLPositionJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "img_src", nullable = false)
    private String imgSrc;

    @Enumerated(EnumType.STRING)
    @Column(name = "position_match_rate", nullable = false)
    private PositionMatchRate positionMatchRate;

    @Column(name = "description", length = 500, nullable = false)
    private String description;

    public LoLPosition toModel() {
        return LoLPosition.builder()
                .id(id)
                .positionMatchRate(positionMatchRate)
                .imgSrc(imgSrc)
                .description(description)
                .build();
    }
}
