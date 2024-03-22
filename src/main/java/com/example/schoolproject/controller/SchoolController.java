package com.example.schoolproject.controller;

import com.example.schoolproject.controller.mapper.SchoolModelToDto;
import com.example.schoolproject.controller.model.SchoolModel;
import com.example.schoolproject.service.SchoolService;
import com.example.schoolproject.service.dto.SchoolDto;
import com.example.schoolproject.service.mapper.SchoolDtoToModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SchoolController implements SchoolApi {

    private final SchoolService service;

    public SchoolController(SchoolService service) {
        this.service = service;
    }

    @Override
    @GetMapping("school/{id}")
    public SchoolModel getSchool(@PathVariable("id") Long id) {
        SchoolDto schoolDto = service.getSchool(id);
        return SchoolDtoToModel.map(schoolDto);
    }

    @Override
    @GetMapping("/all-school")
    public List<SchoolModel> getAllSchools() {
        List<SchoolDto> schoolDtos = service.getAllSchools();
        List<SchoolModel> schoolModels = new ArrayList<>();
        for(SchoolDto schoolDto: schoolDtos ) {
            SchoolModel schoolModel = SchoolDtoToModel.map(schoolDto);
            schoolModels.add(schoolModel);
        }
        return schoolModels;
    }

    @Override
    @PostMapping("/add-school")
    public SchoolModel createSchool(@RequestBody SchoolModel model) {
        SchoolDto schoolDto = service.createSchool(SchoolModelToDto.map(model));
        return SchoolDtoToModel.map(schoolDto);
    }

    @Override
    @PutMapping("update-school")
    public SchoolModel updateSchool(@RequestBody SchoolModel model) {
        SchoolDto schoolDto = service.updateSchool(SchoolModelToDto.map(model));
        return SchoolDtoToModel.map(schoolDto);
    }

    @Override
    @DeleteMapping("delete-school/{id}")
    public SchoolModel deleteSchool(@PathVariable Long id) {
        SchoolDto schoolDto = service.deleteSchool(id);
        return SchoolDtoToModel.map(schoolDto);
    }

    @Override
    @DeleteMapping("delete-schools")
    public void deleteAll() {
        service.deleteAll();
    }
}
