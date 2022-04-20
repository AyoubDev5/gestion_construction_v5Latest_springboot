package com.homeTeam.pfe_V4.service;

import com.homeTeam.pfe_V4.entity.Projet;
import com.homeTeam.pfe_V4.entity.Tache;
import com.homeTeam.pfe_V4.repositorie.ProjetRepository;
import com.homeTeam.pfe_V4.repositorie.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheService {
    @Autowired
    private TacheRepository tacheRepository;
    @Autowired
    private ProjetRepository projetRepository;

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
//    public List<Tache> getTacheByIdProjet(int idProjet) {
//        return (List<Tache>) tacheRepository.findById(idProjet).orElse(null);
//    }
//    public List<Tache> getTacheByIdProjet(Projet projet) {
//        return (List<Tache>) tacheRepository.findById(projet.getIdProjet()).orElse(null);
//    }

    public String deleteTache(int idTache) {
        tacheRepository.deleteById(idTache);
        return "Projet removed !! " + idTache;
    }

    public Tache updateTache(int id,Tache tache) {
        Tache existingProduct = tacheRepository.findById(id).orElse(null);
        existingProduct.setDateDebut(tache.getDateDebut());
        existingProduct.setDateFin(tache.getDateFin());
        existingProduct.setDescriptionTache(tache.getDescriptionTache());
        existingProduct.setNouveauPrix(tache.getNouveauPrix());
        existingProduct.setProjet(tache.getProjet());
        return tacheRepository.save(existingProduct);
    }


//    public Tache addTacheToprojet(Integer idprojet) {
//        Projet projet = projetRepository.findById(idprojet).get();
//        tache.setProjet(projet);
//        return tachesRepository.save(tache);
//    }
}
