package org.example.hibernatefinal.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor

public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String address;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "human_id")
    private Human human;

    public House(String address) {
        this.address = address;
    }
}
