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
    //Ici pour le lien avec User, pas besoin de PERSIST, ni MERGE (sinon erreur de persistance

    @ManyToOne(fetch = FetchType.EAGER)
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

    public Order(Long idOrder, Float priceOrder, Long numberOrder, String pickUpCodeOrder, StatusOrder statusOrder, ReasonCancellationOrder reasonCancellationOrder, User user) {
        this.idOrder = idOrder;
        this.priceOrder = priceOrder;
        this.numberOrder = numberOrder;
        this.pickUpCodeOrder = pickUpCodeOrder;
        this.statusOrder = statusOrder;
        this.reasonCancellationOrder = reasonCancellationOrder;
        this.user = user;
    }

    //////////////////////////////
/// CONSTRUCTEUR VIDE ///
//////////////////////////////

    public Order() {
    }

    //////////////////////////////
/// GETTER - Accesseurs///
//////////////////////////////

    public Long getIdOrder() {
        return idOrder;
    }

    public Float getPriceOrder() {
        return priceOrder;
    }

    public Long getNumberOrder() {
        return numberOrder;
    }

    public String getPickUpCodeOrder() {
        return pickUpCodeOrder;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public ReasonCancellationOrder getReasonCancellationOrder() {
        return reasonCancellationOrder;
    }


//////////////////////////////
///SETTER -  ///
//////////////////////////////

    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }

    public void setPriceOrder(Float priceOrder) {
        this.priceOrder = priceOrder;
    }

    public void setNumberOrder(Long numberOrder) {
        this.numberOrder = numberOrder;
    }

    public void setPickUpCodeOrder(String pickUpCodeOrder) {
        this.pickUpCodeOrder = pickUpCodeOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }

    public void setReasonCancellationOrder(ReasonCancellationOrder reasonCancellationOrder) {
        this.reasonCancellationOrder = reasonCancellationOrder;
    }

}
