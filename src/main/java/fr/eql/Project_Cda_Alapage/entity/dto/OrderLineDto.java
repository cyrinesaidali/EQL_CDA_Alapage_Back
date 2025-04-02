package fr.eql.Project_Cda_Alapage.entity.dto;

import fr.eql.Project_Cda_Alapage.entity.Order;
import fr.eql.Project_Cda_Alapage.entity.Textbook;


public class OrderLineDto {

    private Long idOrderLine;

    private Long quantityTextbook;

    private Textbook textbook;

    private Order order;

    public OrderLineDto(Long idOrderLine, Long quantityTextbook, Textbook textbook, Order order) {
        this.idOrderLine = idOrderLine;
        this.quantityTextbook = quantityTextbook;
        this.textbook = textbook;
        this.order = order;
    }

    public Long getQuantityTextbook() {
        return quantityTextbook;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public Order getOrder() {
        return order;
    }

    public Long getIdOrderLine() {
        return idOrderLine;
    }
}
