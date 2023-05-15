package com.example.jpa_study.member;

import com.example.jpa_study.BaseEntity;
import com.example.jpa_study.recent.Recent;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "member")
    private List<Recent> recents = new ArrayList<>();

    private String name;

    private String profileImage;

}
