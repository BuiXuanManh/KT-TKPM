package com.example.cource.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String courseImagePath;
    private String oldPrice;
    private String Price;
    private String CreatedBy;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
