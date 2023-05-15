package com.example.jpa_study.work;

import com.example.jpa_study.BaseEntity;
import com.example.jpa_study.author.Author;
import com.example.jpa_study.recent.Recent;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Work extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "work")
    private List<Recent> recents = new ArrayList<>();
    @ManyToOne
    private Author author;
    private String workTitle;
    private String day;
    private Double GPA;
    private String genre;
}
