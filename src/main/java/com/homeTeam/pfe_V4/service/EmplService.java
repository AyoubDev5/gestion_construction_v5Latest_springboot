package com.homeTeam.pfe_V4.service;

import com.homeTeam.pfe_V4.entity.Empl;
import com.homeTeam.pfe_V4.repositorie.EmplRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.Date;
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

    public Empl updateEmpl(Empl empl) {
        Empl existingProduct = emplRepository.findById(
                empl.getIdEmpl()).orElse(null);
        existingProduct.setCNE(empl.getCNE());
        existingProduct.setDate_debut(empl.getDate_debut());
        existingProduct.setDate_fin(empl.getDate_fin());
        existingProduct.setTele(empl.getTele());
        existingProduct.setImage(empl.getImage());
        return emplRepository.save(existingProduct);
    }
}



/////////////////////////////////////////
//    public void  saveProductToDB( MultipartFile file, String CNE, Date date_debut,
//                               Date date_fin, String tele, int price)
//    {
//        Empl e = new Empl();
//        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
//        if(fileName.contains(".."))
//        {
//            System.out.println("not a a valid file");
//        }
//        try {
//            e.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        e.setCNE(CNE);
//        e.setDate_debut(date_debut);
//        e.setDate_fin(date_fin);
//        e.setTele(tele);
//        e.setPrice(price);
//        emplRepository.save(e);
//    }
//
//
//
//    public List<Empl> getAllEmpl()
//    {
//        return emplRepository.findAll();
//    }
//


