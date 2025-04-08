package fr.eql.Project_Cda_Alapage.service;

import fr.eql.Project_Cda_Alapage.entity.Order;

import java.util.List;

public interface OrderClientService {

    List<Order> consultAllOrders();

    void updateOrder(Order order);

    void cancelOrder(Order order);

}
