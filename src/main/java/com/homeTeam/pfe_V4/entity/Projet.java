package com.homeTeam.pfe_V4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(
        name = "projet"
)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Projet {

    @Id
    @SequenceGenerator(
            name = "projet_sequence",
            sequenceName = "projet_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "projet_sequence"
    )

    private Integer idProjet;
    private String nomProjet;
    private Date dateDebut;
    private Date dateFin;


//    @OneToMany(
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name = "projet_id",
//            referencedColumnName = "idProjet"
//    )
//    private List<Tache> tache;
}