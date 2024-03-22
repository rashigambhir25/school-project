package com.example.schoolproject.controller.mapper;

import com.example.schoolproject.controller.model.SchoolModel;
import com.example.schoolproject.repo.entity.SchoolEntity;
import com.example.schoolproject.service.dto.SchoolDto;

public class SchoolModelToDto {

    public static SchoolDto map(SchoolModel model) {
        return SchoolDto.builder()
                .id(model.getId())
                .name(model.getName())
                .board(model.getBoard())
                .build();
    }
}
