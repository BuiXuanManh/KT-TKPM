package com.example.cource.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Entity
@Data
@RedisHash("Course")
public class Course implements Serializable {

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
