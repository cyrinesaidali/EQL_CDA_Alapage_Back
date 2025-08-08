package fr.eql.Project_Cda_Alapage.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig {

    /////////////////
    /// Attributs ///
    /////////////////

    /** Injecté par son mutateur */
    private JwtAuthenticationFilter jwtAuthenticationFilter ;

    /////////////
    /// Beans ///
    /////////////

    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http) throws Exception {
        http.csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeHttpRequests()
                .requestMatchers(HttpMethod.OPTIONS,"/**").permitAll()
                .requestMatchers("/api/rest/security/**").permitAll()
                .requestMatchers("/api/rest/catalog/**").permitAll() //pour l'affichage des manuels disponibles
                .requestMatchers("/api/rest/administrator/**").hasAuthority("ADMINISTRATOR") //pour la gestion des manuels et la gestion admin
                .requestMatchers("/api/rest/client/**").hasAuthority("CLIENT") //pour la gestion du compte client
                .requestMatchers("/api/rest/order/**").hasAuthority("CLIENT") //pour la gestion et mise en place des commandes
        //.requestMatchers("/api/rest/catalog/**").hasAnyAuthority("ADMINISTRATOR", "CLIENT"); //pour l'affichage des manuels disponibles
        ;
        http.addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
        return  http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /////////////////
    /// Mutateurs ///
    /////////////////

    @Autowired
    public void setJwtAuthenticationFilter(JwtAuthenticationFilter jwtAuthenticationFilter) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
    }
}