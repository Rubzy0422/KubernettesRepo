package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor //adds a constructor with no arguments
@AllArgsConstructor // adds a constructor with all arguments
@Getter // adds getter methods for all fields
@Setter // adds setter methods for all fields
@Entity // adds JPA annotations / marks this class as an entity
public class Student {
    @Id // adds a primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //Indicates that the Id field is automatically generated
    private Long id;
    private String name;
    private String regNo;
    private String course;
}