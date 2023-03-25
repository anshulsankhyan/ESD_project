package com.example.demorest.Bean;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeID;

    @Column(name = "name",nullable = false,unique = true)
    private String name;


    @Column(name ="email",nullable = false,unique = true)
    private String email;

    @Column(name ="password",nullable = false,unique = true)
    private String password;




    public Employee(){

    }

    public Employee(int employeeID, String name, String email, String password) {
        this.employeeID = employeeID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getname() {
        return name;
    }

    public void setname(String employeeName) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getpassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // to string to print object as a string otherwise it returns object Hashcode
    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password
                ;
    }
}
