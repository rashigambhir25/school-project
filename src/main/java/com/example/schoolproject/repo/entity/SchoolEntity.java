package com.example.schoolproject.repo.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@Table(name = "school_entity")
public class SchoolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "school_name")
    private String name;
    private String board;

    public SchoolEntity(Long id, String name, String board) {
        this.id = id;
        this.name = name;
        this.board = board;
    }

    public SchoolEntity() {}
}
