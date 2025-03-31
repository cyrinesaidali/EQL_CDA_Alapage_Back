package fr.eql.Project_Cda_Alapage.controller;

import fr.eql.Project_Cda_Alapage.entity.dto.AuthenticationSiteDto;
import fr.eql.Project_Cda_Alapage.entity.dto.RegistrationSiteDto;
import fr.eql.Project_Cda_Alapage.entity.dto.UserDto;
import fr.eql.Project_Cda_Alapage.service.SecurityService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/rest/security")
public class SecurityControllerRest {

    private static final Logger logger = LogManager.getLogger();

    /////////////////
    /// ATTRIBUTS  ///
    /////////////////

    private SecurityService securityService;

    /////////////////
    /// Endpoints ///
    /////////////////

    //RequestBody → Pour que ça se retrouve au niveau du body JSON
    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody RegistrationSiteDto registrationSiteDto) {
        return securityService.register(registrationSiteDto);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<UserDto> authenticate(@RequestBody AuthenticationSiteDto authenticationSiteDto) {
        return securityService.authenticate(authenticationSiteDto);
    }

    @Autowired
    public void setSecurityService(SecurityService securityService) {
        this.securityService = securityService;
    }
}
