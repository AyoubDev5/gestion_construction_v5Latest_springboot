package com.homeTeam.pfe_V4.controller;

import com.homeTeam.pfe_V4.entity.Projet;
import com.homeTeam.pfe_V4.repositorie.ProjetRepository;
import com.homeTeam.pfe_V4.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProjetController {
    @Autowired
    private ProjetService projetService;
    private ProjetRepository projetRepository;

    @PostMapping("/addProjet")
    public Projet addProjet(@RequestBody Projet projet) {
        return projetService.saveProjet(projet);
    }

    @PostMapping("/addProducts")
    public List<Projet>addProjets(@RequestBody List<Projet> projets) {
        return projetService.saveProjets(projets);
    }

    @GetMapping("/projets")
    public List<Projet> findAllProjets() {
        return projetService.getProjets();
    }

    @GetMapping("/projetById/{id}")
    public Projet findProjetById(@PathVariable int id) {
        return projetService.getProductById(id);
    }

//    @GetMapping("/product/{name}")
//    public Projet findProjetByName(@PathVariable String name) {
//        return projetService.getProjetByName(name);
//    }

//    @PutMapping("/updateProjet")
//    public Projet updateProjet(@RequestBody Projet product) {
//        return projetService.updateProjet(product);
//    }


    @PutMapping("/updateProjet")
    public Projet PutUser(@RequestBody Projet projet) {
        Projet oldUser = projetRepository.findById(projet.getIdProjet()).orElse(null);
        oldUser.setNomProjet(projet.getNomProjet());
        oldUser.setDateDebut(projet.getDateDebut());
        oldUser.setDateFin(projet.getDateFin());
        return projetRepository.save(oldUser);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProjet(@PathVariable int id) {
        return projetService.deleteProjet(id);
    }
}