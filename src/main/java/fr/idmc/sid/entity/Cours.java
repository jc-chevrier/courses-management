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
public class Cours {
    @Id
    private Long id;

    private String libelle;

    @ManyToOne
    @JoinColumn(name = "ID_FORMATION", referencedColumnName = "ID")
    private Formation formation;

    @ManyToOne
    @JoinColumn(name = "ID_PERSONNE_PROFESSEUR", referencedColumnName = "ID")
    private Personne professeur;
}