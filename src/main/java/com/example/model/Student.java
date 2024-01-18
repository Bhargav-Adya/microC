package com.example.model;

import io.micronaut.serde.annotation.SerdeImport;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import io.micronaut.core.annotation.Introspected;
@Entity
@Data
@Introspected
@SerdeImport(Student.class)

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Use lowercase 'id' for the field name
    private String name; // Use lowercase 'name' for the field name
    private String age;

    // Constructors, getters, and setters...
}
