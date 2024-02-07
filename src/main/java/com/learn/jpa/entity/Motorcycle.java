package com.learn.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MOTOR_CYCLE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Motorcycle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "gear_box")
    private String gearBox;

    @Column(name = "wheels")
    private String wheels;

    @Column(name = "length")
    private String length;

    @Column(name = "height")
    private String height;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "engine_id")
    private Engine engine;

}
