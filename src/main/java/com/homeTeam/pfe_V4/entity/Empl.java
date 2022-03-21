package com.homeTeam.pfe_V4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
            sequenceName = "empl_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "empl_id_sequence"
    )

    private Integer idEmpl;
    @Column(
            name = "cne",
            nullable = false,
            columnDefinition = "TEXT",
            unique = true
    )
    private String CNE;
    private Date date_debut;
    private Date date_fin;
    @Column(
            name = "tele",
            unique = true
    )
    private String tele;
    private int price;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;



    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "travailler",
            joinColumns = {
                    @JoinColumn(
                            name = "id_Empl",
                            referencedColumnName = "idEmpl",
                            foreignKey = @ForeignKey(
                                    name = "empl_id_fk"
                            )
                    )},
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "id_Taches",
                            referencedColumnName = "idTaches",
                            foreignKey = @ForeignKey(
                                    name = "tache_id_fk"
                            )
                    )}
    )
    private List<Tache> taches;
    public void addTaches(Tache tache){
        if(taches == null)
            taches = new ArrayList<>();
        taches.add(tache);
    }
}