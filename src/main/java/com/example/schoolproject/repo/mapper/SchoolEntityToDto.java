package com.example.schoolproject.repo.mapper;

import com.example.schoolproject.repo.entity.SchoolEntity;
import com.example.schoolproject.service.dto.SchoolDto;

public class SchoolEntityToDto {
    public static SchoolDto map(SchoolEntity entity) {
        return SchoolDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .board(entity.getBoard())
                .build();
    }
}
