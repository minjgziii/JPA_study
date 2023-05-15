package com.example.jpa_study.episode;

import com.example.jpa_study.BaseEntity;
import com.example.jpa_study.work.Work;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access= AccessLevel.PROTECTED)
public class Episode extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Work work;
    private String episodeTitle;
    private Double GPA;

}
