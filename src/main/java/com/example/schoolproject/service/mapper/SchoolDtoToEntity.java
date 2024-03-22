package com.example.schoolproject.service.mapper;

import com.example.schoolproject.repo.entity.SchoolEntity;
import com.example.schoolproject.service.dto.SchoolDto;

public class SchoolDtoToEntity {

    public static SchoolEntity map(SchoolDto schoolDto) {
        return SchoolEntity.builder()
                .id(schoolDto.getId())
                .name(schoolDto.getName())
                .board(schoolDto.getBoard())
                .build();
    }
}
