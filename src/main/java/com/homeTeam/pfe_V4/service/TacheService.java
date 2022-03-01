package com.homeTeam.pfe_V4.service;

import com.homeTeam.pfe_V4.entity.Tache;
import com.homeTeam.pfe_V4.repositorie.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheService {
    @Autowired
    private TacheRepository tacheRepository;

    public Tache saveTache(Tache tache) {
        return tacheRepository.save(tache);
    }

    public List<Tache> saveTaches(List<Tache> taches) {
        return tacheRepository.saveAll(taches);
    }

    public List<Tache> getTaches() {
        return tacheRepository.findAll();
    }

    public Tache getTacheById(int idTache) {
        return tacheRepository.findById(idTache).orElse(null);
    }

    public String deleteTache(int idTache) {
        tacheRepository.deleteById(idTache);
        return "Projet removed !! " + idTache;
    }

    public Tache updateTache(Tache tache) {
        Tache existingProduct = tacheRepository.findById(
                tache.getIdTaches()).orElse(null);
        existingProduct.setDateDebut(tache.getDateDebut());
        existingProduct.setDateFin(tache.getDateFin());
        existingProduct.setDescriptionTache(tache.getDescriptionTache());
        existingProduct.setNouveauPrix(tache.getNouveauPrix());
        return tacheRepository.save(existingProduct);
    }
}
