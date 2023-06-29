package com.example.msjavafxdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {
    @Id
    private String msbacsi;
    private String tenbacsi;

    public Doctor() {
    }

    public String getMsbacsi() {
        return msbacsi;
    }

    public String getTenbacsi() {
        return tenbacsi;
    }

    public void setTenbacsi(String tenbacsi) {
        this.tenbacsi = tenbacsi;
    }

    public void setMsbacsi(String msbacsi) {
        this.msbacsi = msbacsi;
    }

    public Doctor(String msbacsi, String tenbacsi) {
        this.msbacsi = msbacsi;
        this.tenbacsi = tenbacsi;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "msbacsi='" + msbacsi + '\'' +
                ", tenbacsi='" + tenbacsi + '\'' +
                '}';
    }
}
