package com.learn.jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ENGINE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
