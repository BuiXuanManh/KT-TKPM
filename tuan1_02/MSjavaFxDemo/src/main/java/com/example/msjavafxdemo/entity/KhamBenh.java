package com.example.msjavafxdemo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Locale;

@Entity
public class KhamBenh {
    @Id
    @ManyToOne
    @JoinColumn(name = "msbs")
    private Doctor doctor;
    @Id
    @ManyToOne
    @JoinColumn(name = "msbn")
    private Patient patient;
    private LocalDate ngayKham;
    private String ghiChu;
}
