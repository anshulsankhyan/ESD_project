package com.example.demorest.DAO;

import com.example.demorest.Bean.Organization_HR;

import java.util.List;

public interface Organization_HRDAO {
    boolean addProject(Organization_HR projectObj);
    List<Organization_HR> getHRList();
    boolean updateProjectName(int HRId,  String updatedName);
}