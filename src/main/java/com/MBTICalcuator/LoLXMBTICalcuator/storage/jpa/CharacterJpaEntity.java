package com.MBTICalcuator.LoLXMBTICalcuator.storage.jpa;

import com.MBTICalcuator.LoLXMBTICalcuator.core.mbti.Character;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "character_info")
@Getter
public class CharacterJpaEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "description", length = 500, nullable = false)
        private String description;

        @Column(name = "img_src", nullable = false)
        private String imgSrc;

        public Character toModel() {
            return Character.builder()
                    .id(id)
                    .description(description)
                    .imgSrc(imgSrc)
                    .build();
        }
}
