package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;

@Entity
@Table (name = "product_entity")
public class Product_entity {
    @Id
    @Column(name = "bar_code_number",length = 15)
    private  String bar_code_number;

    @Column(name = "name")
    private String name;

    @Column(name = "consumable")
    private boolean consumable;

    //Un produit a une et une seule marque
    @ManyToOne
    private Brand_entity brand;

}