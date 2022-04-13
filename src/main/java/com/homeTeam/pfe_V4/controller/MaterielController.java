package com.homeTeam.pfe_V4.controller;

import com.homeTeam.pfe_V4.entity.Materiel;
import com.homeTeam.pfe_V4.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MaterielController {
    @Autowired
    private MaterielService materielService;

    @PostMapping("/addMateriel")
    public Materiel addMateriel(@RequestBody Materiel materiel) {
        return materielService.savemateriel(materiel);
    }

    @PostMapping("/addMateriels")
    public List<Materiel> addMateriels(@RequestBody List<Materiel> materiels) {
        return materielService.savemateriels(materiels);
    }

    @GetMapping("/materiels")
    public List<Materiel> findAllMateriels() {
        return materielService.getmateriels();
    }

    @GetMapping("/materielById/{id}")
    public Materiel findMaterielById(@PathVariable int id) {
        return materielService.getmaterielById(id);
    }

    @PutMapping("/updateMateriel")
    public Materiel updateMateriel(@RequestBody Materiel  materiel) {
        return materielService.updateMateriel(materiel);
    }

    @DeleteMapping("/deleteMateriel/{id}")
    public String deleteMateriel(@PathVariable int id) {
        return materielService.deletemateriel(id);
    }
}
