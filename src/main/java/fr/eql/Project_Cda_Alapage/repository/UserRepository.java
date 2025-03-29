package fr.eql.Project_Cda_Alapage.repository;

import fr.eql.Project_Cda_Alapage.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long>{

//Attention à mettre la bonne méthode ici dans UserRepository → Voir avec JpaRepositiory

/// Méthode permettant de vérifier si l'utilisateur existe déjà

    @Query(value = "SELECT * FROM utilisateur WHERE utilisateur.email IS NOT NULL ", nativeQuery = true)
    Boolean userExistsByLogin(String email);

}

