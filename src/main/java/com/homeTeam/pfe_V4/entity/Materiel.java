package com.homeTeam.pfe_V4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "materiel")
public class Materiel {

    @Id
    @SequenceGenerator(
            name = "materiel_id_sequence",
            sequenceName = "taches_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "materiel_id_sequence"
    )

    private Integer idMateriel;
    private String type_materiel;
    private Double prix_unitaire;
    private Integer quantite;

    @ManyToOne
            (
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "tache_id",
            referencedColumnName = "idTaches",
            foreignKey = @ForeignKey(
                    name = "tache_id_fk"
            )
    )
    private Tache tache;

//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "concerne",
//            joinColumns = {
//                    @JoinColumn(
//                            name = "id_Materiel",
//                            referencedColumnName = "idMateriel",
//                            foreignKey = @ForeignKey(
//                                    name = "materiel_id_fk"
//                            )
//                    )},
//            inverseJoinColumns = {
//                    @JoinColumn(
//                            name = "id_Taches",
//                            referencedColumnName = "idTaches",
//                            foreignKey = @ForeignKey(
//                                    name = "tache_id_fk"
//                            )
//                    )}
//    )
//    private List<Tache> taches;
//    public void addTaches(Tache tache){
//        if(taches == null)
//            taches = new ArrayList<>();
//        taches.add(tache);
 //   }
}
