package com.talenthub.admin_tools_canela.model;

import jakarta.persistence.*;

@Entity
public class canelauser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Integer id_canelaUser;
    private String email;
    private String password;
    private String firstname;
    private String secondName;
    private String surname;
    private String secondSurname;
    private Integer phoneNumber;
    private String photoUser;
    private Integer status;
    private Integer position;

    public canelauser() {
    }

    public canelauser(Integer id_canelaUser, String email, String password, String firstname, String secondName, String surname, String secondSurname, Integer phoneNumber, String photoUser, Integer status, Integer position) {
        this.id_canelaUser = id_canelaUser;
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.secondName = secondName;
        this.surname = surname;
        this.secondSurname = secondSurname;
        this.phoneNumber = phoneNumber;
        this.photoUser = photoUser;
        this.status = status;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public Integer getId_canelaUser() {
        return id_canelaUser;
    }

    public void setId_canelaUser(Integer id_canelaUser) {
        this.id_canelaUser = id_canelaUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfirstname() {
        return this.firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhotoUser() {
        return photoUser;
    }

    public void setPhotoUser(String photoUser) {
        this.photoUser = photoUser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
