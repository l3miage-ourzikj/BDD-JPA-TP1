package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Entity
public class User {
    @Id
    private Long idUser;
    private boolean SSO;
    private OffsetDateTime lastConnexion;
}

