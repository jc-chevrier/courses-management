package fr.idmc.sid.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salle {
    @Id
    private Long id;

    private Long numero;

    @ManyToOne
    @JoinColumn(name = "ID_BATIMENT", referencedColumnName = "ID")
    private Batiment batiment;
}
