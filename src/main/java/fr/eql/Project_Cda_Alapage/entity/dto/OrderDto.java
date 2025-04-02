package fr.eql.Project_Cda_Alapage.entity.dto;

import fr.eql.Project_Cda_Alapage.entity.enums.ReasonCancellationOrder;
import fr.eql.Project_Cda_Alapage.entity.enums.StatusOrder;


public class OrderDto {

    //////////////////////////////
    /// ATTRIBUTS ///
    //////////////////////////////

    private Long idOrder;

    private Float priceOrder;

    private Long numberOrder;

    private String pickUpCodeOrder;

    private StatusOrder statusOrder;

    private ReasonCancellationOrder reasonCancellationOrder;

    //////////////////////////////
    /// CONSTRUCTEUR SURCHARGÉ ///
    //////////////////////////////

    public OrderDto(Float priceOrder, Long numberOrder, String pickUpCodeOrder, StatusOrder statusOrder, ReasonCancellationOrder reasonCancellationOrder) {
        this.priceOrder = priceOrder;
        this.numberOrder = numberOrder;
        this.pickUpCodeOrder = pickUpCodeOrder;
        this.statusOrder = statusOrder;
        this.reasonCancellationOrder = reasonCancellationOrder;
    }

    /////////////////////////
    /// GETTER - Accesseurs /
    /////////////////////////

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

/////////////////////////
    /// SETTER  /
    /////////////////////////


}
