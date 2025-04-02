package fr.eql.Project_Cda_Alapage.entity;

import fr.eql.Project_Cda_Alapage.entity.enums.ReasonCancellationOrder;
import fr.eql.Project_Cda_Alapage.entity.enums.StatusOrder;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Commande")
public class Order {
/////////////////
/// Attributs ///
/////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_commande")
    private Long idOrder;

    @Column(name="prix_commande")
    private Float priceOrder;

    @Column(name="numero_commande")
    private Long numberOrder;

    @Column(name="code_retrait_commande")
    private String pickUpCodeOrder;

    @Enumerated(EnumType.STRING)
    @Column(name="status_commande")
    private StatusOrder statusOrder;

    @Enumerated(EnumType.STRING)
    @Column(name="raison_annule_commande")
    private ReasonCancellationOrder reasonCancellationOrder;

////// Jointures avec JPA :
    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private User user;

    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLineList = new ArrayList<>();


//    private Date dateValidationOrder;
//    private Date dateCancellingOrder;
//    private Date dateModificationOrder;
//    private Date dateRegistrationOrder;


//////////////////////////////
/// CONSTRUCTEUR SURCHARGÉ ///
//////////////////////////////


//////////////////////////////
/// CONSTRUCTEUR VIDE ///
//////////////////////////////

//////////////////////////////
/// GETTER - Accesseurs///
//////////////////////////////

//////////////////////////////
///SETTER -  ///
//////////////////////////////

}
