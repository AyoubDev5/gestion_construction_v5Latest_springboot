package com.homeTeam.pfe_V4.controller;

import com.homeTeam.pfe_V4.service.EmplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmplController {
    @Autowired
    private EmplService emplService;
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
}
