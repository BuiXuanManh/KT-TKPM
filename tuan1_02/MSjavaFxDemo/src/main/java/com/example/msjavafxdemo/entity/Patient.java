package com.example.msjavafxdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
    @Id
    private String msbn;
    private String cmnd;
    private String hoten;
    private String diachi;
    public  Patient(){}
    public Patient(String msbn, String cmnd, String hoten, String diachi) {
        this.msbn = msbn;
        this.cmnd = cmnd;
        this.hoten = hoten;
        this.diachi = diachi;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public void setMsbn(String msbn) {
        this.msbn = msbn;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMsbn() {
        return msbn;
    }

    public String getCmnd() {
        return cmnd;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }
}
