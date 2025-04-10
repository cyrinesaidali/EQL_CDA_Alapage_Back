package fr.eql.Project_Cda_Alapage.service.impl;

import fr.eql.Project_Cda_Alapage.entity.Order;
import fr.eql.Project_Cda_Alapage.entity.OrderLine;
import fr.eql.Project_Cda_Alapage.entity.Textbook;
import fr.eql.Project_Cda_Alapage.entity.User;
import fr.eql.Project_Cda_Alapage.entity.dto.AuthenticationSiteDto;
import fr.eql.Project_Cda_Alapage.entity.dto.OrderDto;
import fr.eql.Project_Cda_Alapage.entity.dto.OrderLineDto;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookDto;
import fr.eql.Project_Cda_Alapage.entity.dto.UserDto;
import fr.eql.Project_Cda_Alapage.repository.OrderLineRepository;
import fr.eql.Project_Cda_Alapage.repository.OrderRepository;
import fr.eql.Project_Cda_Alapage.repository.TextbookRepository;
import fr.eql.Project_Cda_Alapage.repository.UserRepository;
import fr.eql.Project_Cda_Alapage.service.OrderClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderClientServiceImpl implements OrderClientService {
    ///////////////////////////
    /// ATTRIBUS  ///
    //////////////////////////

    private static final Logger logger = LogManager.getLogger();

    private TextbookRepository textbookRepository;
    private OrderRepository orderRepository;
    private UserRepository userRepository;
    private OrderLineRepository orderLineRepository;


    private final SecurityServiceImpl securityServiceImpl;

    @Autowired
    public OrderClientServiceImpl(SecurityServiceImpl securityServiceImpl) {
        this.securityServiceImpl = securityServiceImpl;
    }


    ////////////////
    /// MÉTHODES ///
    ////////////////
    //Création NewOrder en fonction de l'Id utilisateur conneceté
    @Override
    public Order createNewOrder(OrderDto orderDto) {
        //Permet d'avoir les informations de l'utilisateur authentifié
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userLogin = authentication.getName();
        logger.info("Nom d'utilisateur : " + authentication.getName() + "\r\n Autorités (Rôles) : " + authentication.getAuthorities());
        User actualClient = userRepository.findByLogin(userLogin);

        Order orderCreated = new Order(
                orderDto.getIdOrder(),
                orderDto.getPriceOrder(),
                orderDto.getNumberOrder(),
                orderDto.getPickUpCodeOrder(),
                orderDto.getStatusOrder(),
                orderDto.getReasonCancellationOrder(),
                actualClient
        );
        return orderRepository.save(orderCreated);
    }

    @Override
    public OrderLine addNewOrderline(OrderLineDto orderLineDto) {
        System.out.println("********** rentrer ");
        List<Textbook> allTextbookList = textbookRepository.findAll();
        List<Textbook> textbookAvailableList = textbookRepository.findByAvailibility(allTextbookList);
        Textbook textbookFound = textbookAvailableList.get(0);
        System.out.println("******* test 1 : " + textbookFound);

//        OrderLine.size
//        for orderLine size;
//        for (int i = 0; i < ; i++) {
//
//        }
        System.out.println("******* test 1 : " + textbookFound);


        Authentication actualAuthentication = SecurityContextHolder.getContext().getAuthentication();
        String userLogin = actualAuthentication.getName();
        Order orderAssociatedToActualUser = orderRepository.findOrderByUser(userLogin);

        System.out.println("******* test 2 : " + orderAssociatedToActualUser);

        OrderLine orderLineToAdd = new OrderLine(
                orderLineDto.getIdOrderLine(),
                orderLineDto.getQuantityTextbook(),
                textbookFound,
                orderAssociatedToActualUser
                );
        return orderLineRepository.save(orderLineToAdd);

    }

    @Override
    public OrderLine addTextbookInOrderline(TextbookDto textbookDto) {
        User client = new User();
        return null;
    }


    @Override
    public void updateOrder(OrderDto orderDto) {

    }


    ///////////////////////////
    /// SETTERS - AUTOWIRED ///
    //////////////////////////

    @Autowired
    public void setTextbookRepository(TextbookRepository textbookRepository) {
        this.textbookRepository = textbookRepository;
    }

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setOrderLineRepository(OrderLineRepository orderLineRepository) {
        this.orderLineRepository = orderLineRepository;
    }
}
