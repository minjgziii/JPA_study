package com.example.jpa_study.completion;

import com.example.jpa_study.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Completion extends BaseEntity {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer chapterComplet;
}