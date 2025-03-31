package fr.eql.Project_Cda_Alapage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ligne_commande")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ligne_commande")
    private Long idOrderLine;

    @Column(name="quantite_manuel")
    private Long quantityTextbook;

    @ManyToOne
    @JoinColumn(name = "id_manuel")
    private Textbook textbook;

    @ManyToOne
    @JoinColumn(name = "id_commande")
    private Order order;

}
