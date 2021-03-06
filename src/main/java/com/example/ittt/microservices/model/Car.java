package com.example.ittt.microservices.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Engine engine;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Brand brand;

    @NotNull
    private String model;
}
