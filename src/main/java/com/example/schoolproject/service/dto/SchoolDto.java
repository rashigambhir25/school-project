package com.example.schoolproject.service.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SchoolDto {
    private Long id;
    private String name;
    private String board;
}
