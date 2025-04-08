package fr.eql.Project_Cda_Alapage.repository;

import fr.eql.Project_Cda_Alapage.entity.Textbook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TextbookRepository extends JpaRepository<Textbook, Long> {
/*
Requête SQL qui permet de filtrer les manuels scolaires en fonction des LIKE :referenceTextbook
→ Au lieu d'utiliser un point d'interrogation (?) pour indiquer un paramètre, vous utilisez un nom précédé de deux-points (:).
L'utilisation de paramètres nommés (comme :referenceTextbook) est une bonne pratique, car elle améliore la lisibilité de votre code et réduit le risque d'erreurs.
 */
    @Query(value = "SELECT * FROM Manuel_Scolaire WHERE isbn LIKE :isbn", nativeQuery = true)
    Textbook existByIsbn(String isbn);

    @Query(value = "SELECT * FROM Manuel_Scolaire WHERE isbn =:isbn", nativeQuery = true)
    Textbook findByIsbn(@Param("isbn") String isbn);

    @Query(value = "SELECT * " +
            "FROM Manuel_Scolaire " +
            "WHERE statut_dispo_manuel " +
            "LIKE CONCAT('DISPONIBLE') ", nativeQuery = true)
    List<Textbook> findByAvailibility(List<Textbook> allTextbootList);

}
