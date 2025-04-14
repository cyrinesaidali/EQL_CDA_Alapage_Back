package fr.eql.Project_Cda_Alapage.service;

import fr.eql.Project_Cda_Alapage.entity.Order;
import fr.eql.Project_Cda_Alapage.entity.OrderLine;
import fr.eql.Project_Cda_Alapage.entity.dto.OrderDto;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookDto;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookForOrderDto;

import java.util.List;


public interface OrderClientService {

    Order createNewOrder(OrderDto orderDto);

    List<OrderLine> addNewOrderline(List<TextbookForOrderDto> textbooksAddedByClientList);

    OrderLine addTextbookInOrderline(TextbookDto textbookDto);

    void updateOrder(OrderDto orderDto);


    //List<Order> consultAllOrders();

    //void cancelOrder(OrderDto orderDto);

}
