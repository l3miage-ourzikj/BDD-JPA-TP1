package fr.uga.l3miage.tp1.exo1.models;

import fr.uga.l3miage.tp1.exo1.enums.PowerType;
import fr.uga.l3miage.tp1.exo1.enums.WeightUnity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class CarEntity {

    @Id
    private String immatriculation;

    private Double cylinderCapacity;

    private Integer weight;

    private Integer torque;


    private Integer power;

    private LocalDate circulationDate;

    @Enumerated(EnumType.ORDINAL)
    private PowerType powerType;

    @Enumerated(EnumType.STRING)
    private WeightUnity weightUnity;

}
