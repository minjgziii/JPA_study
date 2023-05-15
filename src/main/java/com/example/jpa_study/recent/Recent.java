package com.example.jpa_study.recent;

import com.example.jpa_study.BaseEntity;
import com.example.jpa_study.member.Member;
import com.example.jpa_study.work.Work;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Recent extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Member member;
    @ManyToOne
    private Work work;

}
