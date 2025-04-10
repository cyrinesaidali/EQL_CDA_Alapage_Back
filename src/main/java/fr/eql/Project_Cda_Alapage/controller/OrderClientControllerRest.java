package fr.eql.Project_Cda_Alapage.controller;

import fr.eql.Project_Cda_Alapage.entity.Order;
import fr.eql.Project_Cda_Alapage.entity.OrderLine;
import fr.eql.Project_Cda_Alapage.entity.dto.OrderDto;
import fr.eql.Project_Cda_Alapage.entity.dto.OrderLineDto;
import fr.eql.Project_Cda_Alapage.service.OrderClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/rest/client/order")
@CrossOrigin("${front.url}")
public class OrderClientControllerRest {

    /////////////////
    /// ATTRIBUTS  ///
    /////////////////

    private static final Logger logger = LogManager.getLogger();

    private OrderClientService orderClientService;

    /////////////////
    /// Endpoints ///
    /////////////////

    //Ajout d'une commande par défaut (?)
    @PostMapping("/newOrder")
    public ResponseEntity<Order> createNewOrder(@RequestBody OrderDto orderDto) {
        Order orderToCreate = orderClientService.createNewOrder(orderDto);
        return ResponseEntity.ok(orderToCreate);
    }

    @PostMapping("/addTextbookToOrderline")
    public ResponseEntity<OrderLine> addNewOrderline(@RequestBody OrderLineDto orderLineDto) {
       OrderLine orderLineCreated = orderClientService.addNewOrderline(orderLineDto);
        return ResponseEntity.ok(orderLineCreated);
    }

    ///////////////
    /// SETTERS - Autowired ///
    ///////////////
    @Autowired
    public void setOrderClientService(OrderClientService orderClientService) {
        this.orderClientService = orderClientService;
    }
}
