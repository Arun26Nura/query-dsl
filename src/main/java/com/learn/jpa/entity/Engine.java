package com.learn.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ENGINE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "engine_type")
    private String engineType;

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "max_torque")
    private String maxTorque;

}
