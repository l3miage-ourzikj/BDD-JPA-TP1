package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
public class Product_entity {
    @Id
    private  String bar_code_number;

    private String name;

    private boolean consumable;

    //Un produit a une et une seule marque
    @ManyToOne
    private Brand_entity brand;

}