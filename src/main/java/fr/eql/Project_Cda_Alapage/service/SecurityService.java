package fr.eql.Project_Cda_Alapage.service;

import fr.eql.Project_Cda_Alapage.entity.dto.AuthenticationSiteDto;
import fr.eql.Project_Cda_Alapage.entity.dto.RegistrationSiteDto;
import fr.eql.Project_Cda_Alapage.entity.dto.UserDto;
import org.springframework.http.ResponseEntity;

public interface SecurityService  {

    ResponseEntity<Object> register(RegistrationSiteDto registrationSiteDto);

    ResponseEntity<UserDto> authenticate(AuthenticationSiteDto authenticationSiteDto);

}
