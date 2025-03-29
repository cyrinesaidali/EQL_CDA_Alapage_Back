package fr.eql.Project_Cda_Alapage.service.impl;

import fr.eql.Project_Cda_Alapage.entity.BearerToken;
import fr.eql.Project_Cda_Alapage.entity.Role;
import fr.eql.Project_Cda_Alapage.entity.User;
import fr.eql.Project_Cda_Alapage.entity.dto.AuthenticationSiteDto;
import fr.eql.Project_Cda_Alapage.entity.dto.RegistrationSiteDto;
import fr.eql.Project_Cda_Alapage.entity.dto.UserDto;
import fr.eql.Project_Cda_Alapage.repository.RoleRepository;
import fr.eql.Project_Cda_Alapage.repository.UserRepository;
import fr.eql.Project_Cda_Alapage.security.JwtUtilities;
import fr.eql.Project_Cda_Alapage.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class SecurityServiceImpl implements SecurityService {
/////////////////
/// ATTRIBUTS  ///
/////////////////

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private AuthenticationManager authenticationManager;
    private PasswordEncoder passwordEncoder;
    private JwtUtilities jwtUtilities;

    /////////////////////////////////////////////////////////////////
    /// Méthodes publiques pour s'enregistrer et s'authentifier : ///
    /////////////////////////////////////////////////////////////////
    @Override
    public ResponseEntity<Object> register(RegistrationSiteDto registrationSiteDto) {
        if (userRepository.userExistsByLogin(registrationSiteDto.getEmail())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Identifiants déjà utilisés");
        } else {
            User userCreated = new User();
            userCreated.setSurnameUser(registrationSiteDto.getSurnameUser());
            userCreated.setLastNameUser(registrationSiteDto.getLastNameUser());
            userCreated.setEmail(registrationSiteDto.getEmail());
            userCreated.setPassword(passwordEncoder.encode(registrationSiteDto.getPassword()));
            Role role = roleRepository.findByRoleName(registrationSiteDto.getRoleName());
            userCreated.setRolesList(Collections.singletonList(role));
            userRepository.save(userCreated);
            String token = jwtUtilities.generateToken
                    (registrationSiteDto.getEmail(),
                    Collections.singletonList(role.getRoleName()));
            System.out.println(userCreated);
            return ResponseEntity.status(HttpStatus.OK).body(new BearerToken(token, "Bearer"));
        }
    }

    @Override
    public ResponseEntity<UserDto> authenticate(AuthenticationSiteDto authenticationSiteDto) {
        return null;
    }

    //////////////////////////////
    ///SETTER Autowired ///
    //////////////////////////////

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setRoleRepository(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Autowired
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    public void setJwtUtilities(JwtUtilities jwtUtilities) {
        this.jwtUtilities = jwtUtilities;
    }
}
