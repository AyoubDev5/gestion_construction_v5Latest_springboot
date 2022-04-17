package com.homeTeam.pfe_V4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "materiel_list")
public class MaterielList {
    @Id
    @SequenceGenerator(
            name = "id_sequence",
            sequenceName = "id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "id_sequence"
    )

    private Integer id;
    private String type_materiel;
    private Double prix;

}
