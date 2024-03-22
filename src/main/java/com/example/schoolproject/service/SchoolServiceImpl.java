package com.example.schoolproject.service;

import com.example.schoolproject.repo.SchoolRepo;
import com.example.schoolproject.repo.entity.SchoolEntity;
import com.example.schoolproject.repo.mapper.SchoolEntityToDto;
import com.example.schoolproject.service.dto.SchoolDto;
import com.example.schoolproject.service.mapper.SchoolDtoToEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolRepo repo;
    @Override
    public SchoolDto getSchool(Long id) {
        SchoolEntity schoolEntity = repo.findById(id).orElse(new SchoolEntity());
        SchoolDto schoolDto = SchoolEntityToDto.map(schoolEntity);
        return schoolDto;
    }

    @Override
    public List<SchoolDto> getAllSchools() {
        List<SchoolEntity> schoolEntities = repo.findAll();
        List<SchoolDto> schoolDtos = new ArrayList<>();
        for(SchoolEntity school: schoolEntities) {
            SchoolDto schoolDto = SchoolEntityToDto.map(school);
            schoolDtos.add(schoolDto);
        }
        return schoolDtos;
    }

    @Override
    public SchoolDto createSchool(SchoolDto dto) {
        SchoolEntity schoolEntity = SchoolDtoToEntity.map(dto);
        SchoolEntity savedSchoolEntity = repo.save(schoolEntity);
        return SchoolEntityToDto.map(savedSchoolEntity);
    }

    @Override
    public SchoolDto updateSchool(SchoolDto schoolDto) {
        SchoolEntity schoolEntity = SchoolDtoToEntity.map(schoolDto);
        SchoolEntity entity = repo.save(schoolEntity);
        return SchoolEntityToDto.map(entity);
    }

    @Override
    public SchoolDto deleteSchool(Long id) {
        SchoolEntity schoolEntity = repo.findById(id).orElse(new SchoolEntity());
        repo.deleteById(id);
        return SchoolEntityToDto.map(schoolEntity);
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }


}
