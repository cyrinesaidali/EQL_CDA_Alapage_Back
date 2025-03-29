package fr.eql.Project_Cda_Alapage.security;

import fr.eql.Project_Cda_Alapage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomerUserDetailsService implements UserDetailsService {
    /////////////////
    /// Attributs ///
    /////////////////

    /** Injecté par son mutateur */
    private UserRepository userRepository;

    ////////////////
    /// Méthodes ///
    ////////////////
    @Override
    public UserDetails loadUserByUsername(String surnameUser) throws UsernameNotFoundException {
        return null;
    }

    /////////////////
    /// Mutateurs ///
    /////////////////

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
