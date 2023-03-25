package com.example.demorest.Bean;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name="Organization_HR")
public class Organization_HR {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="HRid")
    private int HRId;

    @Column(name= "first_name",  nullable = false)
    private String first_name;

    @Column(name= "last_name")
    private String last_name;

    public void setOrgID(Organization orgID) {
        this.orgID = orgID;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public Organization getOrgID() {
        return orgID;
    }

    public int getHRId() {
        return HRId;
    }

    public String getContact_number() {
        return contact_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setHRId(int HRId) {
        this.HRId = HRId;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    @Column(name= "email",  unique = true, nullable = false)
    private String email;

    @Column(name= "contact_number")
    private String contact_number;

    @OneToOne
    @JoinColumn(name="HRId")
    private Organization orgID;







    public Organization_HR(){}



    @Override
    public String toString() {
        return "\nOrganization_HR{" +
                "HRid=" + HRId +
                ", first_name='" + first_name + '\'' +
                ", \nlast_name=" + last_name +
                ", \nemail=" + email +
                ", \ncontact_number=" + contact_number +
                '}';
    }
}
