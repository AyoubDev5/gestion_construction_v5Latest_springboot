package com.homeTeam.pfe_V4.service;

import com.homeTeam.pfe_V4.entity.Empl;
import com.homeTeam.pfe_V4.repositorie.EmplRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplService {
    @Autowired
    private EmplRepository emplRepository;

    public Empl saveempl(Empl empl) {
        return emplRepository.save(empl);
    }

    public List<Empl> saveempls(List<Empl> empls) {
        return emplRepository.saveAll(empls);
    }

    public List<Empl> getempls() {
        return emplRepository.findAll();
    }

    public Empl getemplById(int idEmpl) {
        return emplRepository.findById(idEmpl).orElse(null);
    }

    public String deleteEmpl(int idEmpl) {
        emplRepository.deleteById(idEmpl);
        return "Empl removed !! " + idEmpl;
    }

    public Empl updateMateriel(Empl empl) {
        Empl existingProduct = emplRepository.findById(
                empl.getIdEmpl()).orElse(null);
        existingProduct.setCNE(empl.getCNE());
        existingProduct.setDate_debut(empl.getDate_debut());
        existingProduct.setDate_fin(empl.getDate_fin());
        existingProduct.setTele(empl.getTele());
        existingProduct.setPhotos(empl.getPhotos());
        return emplRepository.save(existingProduct);
    }
}
