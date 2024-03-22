package com.example.schoolproject.service;

import com.example.schoolproject.service.dto.SchoolDto;

import java.util.List;

public interface SchoolService {
    SchoolDto getSchool(Long id);
    List<SchoolDto> getAllSchools();
    SchoolDto createSchool(SchoolDto dto);
    SchoolDto updateSchool(SchoolDto dto);
    SchoolDto deleteSchool(Long id);
    void deleteAll();
}
