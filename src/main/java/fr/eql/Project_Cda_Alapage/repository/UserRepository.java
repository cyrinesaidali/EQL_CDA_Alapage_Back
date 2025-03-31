package fr.eql.Project_Cda_Alapage.repository;

import fr.eql.Project_Cda_Alapage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

/// Méthode permettant de vérifier si l'utilisateur existe déjà :

    //@Query(value = "SELECT * FROM utilisateur WHERE utilisateur.email IS NOT NULL ", nativeQuery = true)
    Boolean existsByLogin(String login);
    User findByLogin(String login);

}

