package com.example.schoolproject.service.mapper;

import com.example.schoolproject.controller.model.SchoolModel;
import com.example.schoolproject.service.dto.SchoolDto;

public class SchoolDtoToModel {

    public static SchoolModel map(SchoolDto dto) {
        return SchoolModel.builder()
                .id(dto.getId())
                .name(dto.getName())
                .board(dto.getBoard())
                .build();
    }
}
