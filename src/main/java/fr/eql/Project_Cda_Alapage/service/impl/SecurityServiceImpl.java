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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class SecurityServiceImpl implements SecurityService {
/////////////////
/// ATTRIBUTS  ///
/////////////////

    private static final Logger logger = LogManager.getLogger();

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private AuthenticationManager authenticationManager;
    private PasswordEncoder passwordEncoder;
    private JwtUtilities jwtUtilities;

    /////////////////////////////////////////////////////////////////
    /// Méthodes publiques pour s'enregistrer et s'authentifier : ///
    /////////////////////////////////////////////////////////////////
    @Override
    public ResponseEntity<Object> register(RegistrationSiteDto registrationDto) {
        if (userRepository.existsByLogin(registrationDto.getLogin())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Identifiant déjà utilisé");
        } else {
            User user = new User();
            user.setLastNameUser(registrationDto.getLastNameUser());
            user.setSurnameUser(registrationDto.getSurnameUser());
            user.setEmail(registrationDto.getEmail());
            user.setPhoneNumber(registrationDto.getPhoneNumber());
            user.setBirthdateUser(registrationDto.getBirthdateUser());
            user.setAddress(registrationDto.getAddress());
            user.setLogin(registrationDto.getLogin());
            user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
            Role role = roleRepository.findByRoleName(registrationDto.getRoleName());
            user.setRolesList(Collections.singletonList(role));
            userRepository.save(user);
            String token = jwtUtilities.generateToken(registrationDto.getLogin(), Collections.singletonList(role.getRoleName()));
            return ResponseEntity.status(HttpStatus.OK).body(new BearerToken(token , "Bearer "));
        }
    }

    public ResponseEntity<UserDto> authenticate(AuthenticationSiteDto authenticationDto) {
        Authentication authentication= authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationDto.getLogin(),
                        authenticationDto.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        User user = userRepository.findByLogin(authentication.getName());
        List<String> rolesNames = new ArrayList<>();
        user.getRolesList().forEach(role-> rolesNames.add(role.getRoleName()));
        String token = jwtUtilities.generateToken(user.getUsername(),rolesNames);
        UserDto userDto = new UserDto(user.getIdUser(), user.getSurnameUser(), user.getLastNameUser(), token);
        return ResponseEntity.ok(userDto);
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
