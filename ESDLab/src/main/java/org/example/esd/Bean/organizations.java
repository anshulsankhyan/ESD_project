package org.example.esd.Bean;

import jakarta.persistence.*;

@Entity
@Table(name = "organizations")
public class organizations {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "address")
    private String address;

    public organizations() {
    }

    public organizations( String address) {

        this.address = address;
    }

    public int id() {
        return id;
    }

    public void setDepartmentId(int id) {
        this.id = id;
    }


    public String address() {
        return address;
    }

    public void setDeptAddress(String address) {
        this.address = address;
    }


}