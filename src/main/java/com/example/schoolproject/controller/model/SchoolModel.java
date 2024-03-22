package com.example.schoolproject.controller.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SchoolModel {
    private Long id;
    private String name;
    private String board;
}
