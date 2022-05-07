package com.n.model;

public class Entity {
    public String firstname;
    public String fatherName;
    public String code;
    public String lastname;
    public String spouse;
    public String martial;
    public String fieldOfStudy;
    public String university;
    public String address;

    public Entity() {
    }

    public Entity(String firstname, String fatherName, String code, String lastname, String spouse, String martial, String fieldOfStudy, String university, String address) {
        this.firstname = firstname;
        this.fatherName = fatherName;
        this.code = code;
        this.lastname = lastname;
        this.spouse = spouse;
        this.martial = martial;
        this.fieldOfStudy = fieldOfStudy;
        this.university = university;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public String getMartial() {
        return martial;
    }

    public void setMartial(String martial) {
        this.martial = martial;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
