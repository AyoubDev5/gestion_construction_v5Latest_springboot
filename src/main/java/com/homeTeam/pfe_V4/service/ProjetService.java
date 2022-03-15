package com.homeTeam.pfe_V4.service;


import com.homeTeam.pfe_V4.entity.Projet;
import com.homeTeam.pfe_V4.repositorie.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetService {

    @Autowired
    private ProjetRepository projetRepository;

    public Projet saveProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    public List<Projet> saveProjets(List<Projet> projets) {
        return projetRepository.saveAll(projets);
    }

    public List<Projet> getProjets() {
        return projetRepository.findAll();
    }

    public Projet getProductById(int idProjet) {
        return projetRepository.findById(idProjet).orElse(null);
    }

//    public Projet getProjetByName(String nom_Projet) {
//        return projetRepository.findByName(nom_Projet);
//    }

    public String deleteProjet(int idProjet) {
        projetRepository.deleteById(idProjet);
        return "Projet removed !! " + idProjet;
    }

    public Projet updateProjet(Projet projet) {
        Projet existingProduct = projetRepository.findById(
                projet.getIdProjet()).orElse(null);
        existingProduct.setNomProjet(projet.getNomProjet());
        existingProduct.setDateDebut(projet.getDateDebut());
        existingProduct.setDateFin(projet.getDateFin());
        return projetRepository.save(existingProduct);
    }

}