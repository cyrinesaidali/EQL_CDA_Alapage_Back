package fr.eql.Project_Cda_Alapage.controller;

import fr.eql.Project_Cda_Alapage.entity.Textbook;
import fr.eql.Project_Cda_Alapage.entity.dto.RegistrationSiteDto;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookDto;
import fr.eql.Project_Cda_Alapage.service.SecurityService;
import fr.eql.Project_Cda_Alapage.service.SpaceAdminService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest/administrator")
public class SpaceAdminController {

    private static final Logger logger = LogManager.getLogger();

    /////////////////
    /// ATTRIBUTS  ///
    /////////////////
    private SpaceAdminService spaceAdminService;

    /////////////////
    /// Endpoints ///
    /////////////////

    @PostMapping("/addTextbook")
    public ResponseEntity<Textbook> addTextbook(@RequestBody TextbookDto textbookDto) {
        Textbook textbookAdded = spaceAdminService.addTextbook(textbookDto);
        return ResponseEntity.ok(textbookAdded);
    }

    ///////////////
    /// SETTERS ///
    ///////////////

    @Autowired
    public void setSpaceAdminService(SpaceAdminService spaceAdminService) {
        this.spaceAdminService = spaceAdminService;
    }
}
