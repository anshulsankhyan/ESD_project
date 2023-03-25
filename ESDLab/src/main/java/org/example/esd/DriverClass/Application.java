package org.example.esd.DriverClass;

import org.example.esd.Bean.Department;
import org.example.esd.DAO.DAOImplement.OrganizationDAOImpl;
import org.example.esd.DAO.DepartmentDAO;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application Started");
        runApplication();
        System.out.println("Application Ended");
    }

    private static void runApplication() {
        Department department1 = new Department("Development", "Mumbai");
        Department department2 = new Department();
        department2.setDepartmentName("Data Science");
        department2.setDeptAddress("Bangalore");

        DepartmentDAO departmentDAO = new OrganizationDAOImpl();
        if (departmentDAO.addDepartment(department1))
            System.out.println("Department 1 added successfully.");
        if (departmentDAO.addDepartment(department2))
            System.out.println("Department 2 added successfully.");
    }
}
