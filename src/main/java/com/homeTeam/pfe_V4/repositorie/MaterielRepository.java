package com.homeTeam.pfe_V4.repositorie;

import com.homeTeam.pfe_V4.entity.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Integer> {
}