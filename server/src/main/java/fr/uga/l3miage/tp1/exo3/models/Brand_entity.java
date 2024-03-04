package fr.uga.l3miage.tp1.exo3.models;


import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Brand_entity {
    @Id
    private String company_name;

    private String siretNumber;

    @Enumerated(EnumType.ORDINAL)
    private BrandType type;

    //une marque a 0 ou plusieurs produits (le choix du set et dû au fait qu'il n'existe pas de produits doublons et que la notion d'ordre n'est pas très intéressante dans notre cas)
    @OneToMany(mappedBy = "brand")
    private Set<Product_entity> products;
}
