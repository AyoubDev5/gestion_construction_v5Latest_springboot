package com.homeTeam.pfe_V4.controller;

import com.homeTeam.pfe_V4.entity.Empl;
import com.homeTeam.pfe_V4.service.EmplService;
import com.homeTeam.pfe_V4.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class EmplController {
    @Autowired
    private EmplService emplService;

    @PostMapping("/addEmpl")
    public Empl addProjet(@RequestBody Empl empl) {
        return emplService.saveempl(empl);
    }

    @PostMapping("/addEmpls")
    public List<Empl> addProjets(@RequestBody List<Empl> empls) {
        return emplService.saveempls(empls);
    }

    @GetMapping("/Empls")
    public List<Empl> findAllProjets() {
        return emplService.getempls();
    }

    @GetMapping("/EmplById/{id}")
    public Empl findProjetById(@PathVariable int id) {
        return emplService.getemplById(id);
    }

    @PutMapping("/updateEmpl/{id}")
    public Empl updateEmpl(@PathVariable int id,@RequestBody Empl empl) {
        return emplService.updateEmpl(id,empl);
    }

    @DeleteMapping("/deleteEmpl/{id}")
    public String deleteProjet(@PathVariable int id) {
        return emplService.deleteEmpl(id);
    }
}

//    @PostMapping("/addP")
//    public void saveProduct(@RequestParam("file") MultipartFile file,
//                              @RequestParam("cne") String CNE,
//                              @RequestParam("date_debut") Date date_debut,
//                              @RequestParam("date_fin") Date date_fin,
//                              @RequestParam("tele") String tele,
//                              @RequestParam("price") int price
//                              )
//    {
//        emplService.saveProductToDB(file, CNE, date_debut, date_fin, tele, price );
//    }

//////////////////////////////////////////////////////////////////////////////////////////////////
//
//    @PostMapping("/users/save")
//    public RedirectView saveUser(User user,
//                                 @RequestParam("image") MultipartFile multipartFile) throws IOException {
//
//        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
//        user.setPhotos(fileName);
//
//        User savedUser = repo.save(user);
//
//        String uploadDir = "user-photos/" + savedUser.getId();
//
//        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
//
//        return new RedirectView("/users", true);
//  }
//////////////////////////////////////////////////////////////////////////////////////////////////