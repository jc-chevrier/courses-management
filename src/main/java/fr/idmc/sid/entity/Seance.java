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
public class Seance {
    @Id
    private Long id;

    private Date dateDebut;

    private Date dateFin;

    @ManyToOne
    @JoinColumn(name = "ID_SALLE", referencedColumnName = "ID")
    private Salle salle;

    @ManyToOne
    @JoinColumn(name = "ID_COURS", referencedColumnName = "ID")
    private Cours cours;
}
