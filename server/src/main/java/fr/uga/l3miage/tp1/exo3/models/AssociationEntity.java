package fr.uga.l3miage.tp1.exo3.models;

import fr.uga.l3miage.tp1.exo3.enums.AssociationType;

import javax.persistence.*;

@Entity
public class AssociationEntity {
    @Id
    private String  name;

    @Column(nullable = false)
    private String presidentName;

    @Column(nullable = false)
    private String treasurerName;

    private String secretaryName;

    @Enumerated(EnumType.ORDINAL)
    private AssociationType associationType;

    @ManyToOne
    private FederationEntity federation;
}
