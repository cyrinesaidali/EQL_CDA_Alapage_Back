package fr.eql.Project_Cda_Alapage.repository;

import fr.eql.Project_Cda_Alapage.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "SELECT commande.*, utilisateur.login, utilisateur.nom_utilisateur, utilisateur.prenom_utilisateur " +
            "FROM commande " +
            "JOIN utilisateur ON commande.id_utilisateur = utilisateur.id_utilisateur " +
            "WHERE utilisateur.login = :login", nativeQuery = true)
    Order findOrderByUser(@Param("login") String login);

}
