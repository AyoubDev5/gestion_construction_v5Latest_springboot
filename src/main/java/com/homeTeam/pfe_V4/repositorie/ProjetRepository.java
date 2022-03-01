package com.homeTeam.pfe_V4.repositorie;

import com.homeTeam.pfe_V4.entity.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Integer> {
//    Projet findByName(String nomProjet);
}