package com.homeTeam.pfe_V4.service;

import com.homeTeam.pfe_V4.entity.Materiel;
import com.homeTeam.pfe_V4.repositorie.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterielService {
    @Autowired
    private MaterielRepository materielRepository;

    public Materiel savemateriel(Materiel materiel) {
        return materielRepository.save(materiel);
    }

    public List<Materiel> savemateriels(List<Materiel> materiels) {
        return materielRepository.saveAll(materiels);
    }

    public List<Materiel> getmateriels() {
        return materielRepository.findAll();
    }

    public Materiel getmaterielById(int idMateriel) {
        return materielRepository.findById(idMateriel).orElse(null);
    }

    public String deletemateriel(int idMateriel) {
        materielRepository.deleteById(idMateriel);
        return "Projet removed !! " + idMateriel;
    }

    public Materiel updateMateriel(Materiel materiel) {
        Materiel existingProduct = materielRepository.findById(
                materiel.getIdMateriel()).orElse(null);
        existingProduct.setType_materiel(materiel.getType_materiel());
        existingProduct.setPrix_unitaire(materiel.getPrix_unitaire());
        existingProduct.setQuantite(materiel.getQuantite());
        return materielRepository.save(existingProduct);
    }
}
