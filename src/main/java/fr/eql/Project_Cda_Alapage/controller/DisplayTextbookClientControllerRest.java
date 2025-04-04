package fr.eql.Project_Cda_Alapage.controller;

import fr.eql.Project_Cda_Alapage.entity.Textbook;
import fr.eql.Project_Cda_Alapage.service.DisplayTextbookClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/rest/catalog")
@CrossOrigin("${front.url}")
public class DisplayTextbookClientControllerRest {

    /////////////////
    /// ATTRIBUTS  ///
    /////////////////
    private DisplayTextbookClientService displayTextbookClientService;

    private static final Logger logger = LogManager.getLogger();


    /////////////////
    /// Endpoints ///
    /////////////////

    @GetMapping("/displayTextbooks")
    public ResponseEntity<List<String>> displayAvailableTextbooks() {
        List<String> textbookList = displayTextbookClientService.displayAvailableTextbooks();
        return ResponseEntity.ok(textbookList);
    }


    ///////////////
    /// SETTERS ///
    ///////////////
    @Autowired
    public void setDisplayTextbookClientService(DisplayTextbookClientService displayTextbookClientService) {
        this.displayTextbookClientService = displayTextbookClientService;
    }
}
