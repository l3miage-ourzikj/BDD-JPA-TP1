package fr.uga.l3miage.tp1.exo3.models;


import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "brand_entity")
public class Brand_entity {
    @Id
    @Column(name = "company_name")
    private String company_name;

    @Column (name = "siret_number",length = 11)
    private String siretNumber;

    @Column(name = "type")
    @Enumerated(EnumType.ORDINAL)
    private BrandType type;

    //une marque a 0 ou plusieurs produits (le choix du set et dû au fait qu'il n'existe pas de produits doublons et que la notion d'ordre n'est pas très intéressante dans notre cas)
    @OneToMany(mappedBy = "brand")
    private Set<Product_entity> products;
}
