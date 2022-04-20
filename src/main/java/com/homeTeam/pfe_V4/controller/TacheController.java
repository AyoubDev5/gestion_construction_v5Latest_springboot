package com.homeTeam.pfe_V4.controller;

import com.homeTeam.pfe_V4.entity.Projet;
import com.homeTeam.pfe_V4.entity.Tache;
import com.homeTeam.pfe_V4.service.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TacheController {
    @Autowired
    private TacheService tacheService;

    @PostMapping("/addTache")
    public Tache addTache(@RequestBody Tache tache) {
        return tacheService.saveTache(tache);
    }

    @PostMapping("/addTaches")
    public List<Tache> addTaches(@RequestBody List<Tache> taches) {
        return tacheService.saveTaches(taches);
    }

    @GetMapping("/taches")
    public List<Tache> findAllTaches() {
        return tacheService.getTaches();
    }

//    @GetMapping("/projetById/{id}/taches")
//    public List<Tache> findAllTachesByIdProjet(@PathVariable int id) {
//        return tacheService.getTacheByIdProjet(id);
//    }
//    @GetMapping("/projetById/{id}/taches")
//    public List<Tache> findAllTachesByIdProjet(@PathVariable Projet projet) {
//        return tacheService.getTacheByIdProjet(projet);
//    }

    @GetMapping("/tacheById/{id}")
    public Tache findTacheById(@PathVariable int id) {
        return tacheService.getTacheById(id);
    }

    @PutMapping("/updateTacheById/{id}")
    public Tache updateTache(@PathVariable int id,@RequestBody Tache tache) {
        return tacheService.updateTache(id,tache);
    }

    @DeleteMapping("/deleteTache/{id}")
    public String deleteTache(@PathVariable int id) {
        return tacheService.deleteTache(id);
    }
}
