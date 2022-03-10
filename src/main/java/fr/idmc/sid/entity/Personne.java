package fr.idmc.sid.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personne {
    @Id
    private Long id;

    private String identifiant;

    private String nom;

    private String prenom;

    @ManyToOne
    @JoinColumn(name = "ID_ROLE", referencedColumnName = "ID")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "ID_FORMATION", referencedColumnName = "ID")
    private Formation formation;
}
