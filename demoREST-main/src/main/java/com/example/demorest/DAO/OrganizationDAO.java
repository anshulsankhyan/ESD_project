package com.example.demorest.DAO;

import com.example.demorest.Bean.Organization;



import java.util.List;

public interface OrganizationDAO {
    boolean addOrganization(Organization deptObj);
    List<Organization> getDepartmentList();

    List<Organization> getOrganizationList();
}