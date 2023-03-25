package com.example.demorest.Bean;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name= "Organization")
public class Organization{
    @Id
    @Column(name ="org_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orgID;

    @Column(name="org_name",nullable = false,unique = true)
    private String orgName;

    @Column(name="org_address")
    private String orgAddress;

    public Organization() {
    }

    public Organization(int orgID, String orgName, String orgAddress) {
        this.orgID = orgID;
        this.orgName = orgName;
        this.orgAddress = orgAddress;
    }

    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress) {
        this.orgAddress = orgAddress;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "orgId=" + orgID +
                ", orgName='" + orgName + '\'' +
                ", orgAddress='" + orgAddress + '\'' +
                '}';
    }
}