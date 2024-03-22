package com.example.schoolproject.controller;

import com.example.schoolproject.controller.model.SchoolModel;

import java.util.List;

public interface SchoolApi {
    SchoolModel getSchool(Long id);
    List<SchoolModel> getAllSchools();
    SchoolModel createSchool(SchoolModel model);
    SchoolModel updateSchool(SchoolModel model);
    SchoolModel deleteSchool(Long id);
    void deleteAll();
}
