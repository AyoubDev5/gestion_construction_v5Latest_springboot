package com.homeTeam.pfe_V4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tache {

    @Id
    @SequenceGenerator(
            name = "taches_id_sequence",
            sequenceName = "taches_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "taches_id_sequence"
    )
    private Integer idTaches;
    private Date dateDebut;
    private Date dateFin;
    private String descriptionTache;
    private Number nouveauPrix;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "projet_id",
            referencedColumnName = "idProjet",
            foreignKey = @ForeignKey(
                    name = "projet_id_fk"
            )
    )
    private Projet projet;
}