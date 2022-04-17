package com.homeTeam.pfe_V4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


import static javax.persistence.GenerationType.SEQUENCE;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empl")
public class Empl {

    @Id
    @SequenceGenerator(
            name = "empl_id_sequence",
            sequenceName = "empl_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "empl_id_sequence"
    )

    private Integer idEmpl;
//    @Column(
//            name = "cne"
//    )
//    private String CNE;
    private String lname;
    private String fname;
    private String date_debut;
    private String date_fin;
    @Column(
            name = "tele",
            unique = true
    )
    private String tele;
    private String gmail;
    private int price;

    private String image;

    @ManyToOne()
//            (
//            cascade = CascadeType.ALL
//    )
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
//            name = "travailler",
//            joinColumns = {
//                    @JoinColumn(
//                            name = "id_Empl",
//                            referencedColumnName = "idEmpl",
//                            foreignKey = @ForeignKey(
//                                    name = "empl_id_fk"
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
//    }
}