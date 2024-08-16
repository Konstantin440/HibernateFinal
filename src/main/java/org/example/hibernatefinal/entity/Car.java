package org.example.hibernatefinal.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor

public class Car {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    private String model;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "human_id")
    private Human human;

    public Car(String model) {
        this.model = model;
    }
}
