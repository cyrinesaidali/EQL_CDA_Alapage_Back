package fr.eql.Project_Cda_Alapage.service;

import fr.eql.Project_Cda_Alapage.entity.Order;
import fr.eql.Project_Cda_Alapage.entity.OrderLine;
import fr.eql.Project_Cda_Alapage.entity.Textbook;
import fr.eql.Project_Cda_Alapage.entity.dto.OrderLineDto;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookDto;

import java.util.List;

public interface DisplayTextbookClientService {

    List<Textbook> displayAvailableTextbooks();

    OrderLine addNewOrderline(OrderLineDto orderLineDto);

    OrderLine addTextbookInOrderline(TextbookDto textbookDto);

    Order createNewOrder(Order order);


}
