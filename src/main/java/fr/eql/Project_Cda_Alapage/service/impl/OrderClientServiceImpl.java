package fr.eql.Project_Cda_Alapage.service.impl;

import fr.eql.Project_Cda_Alapage.entity.Order;
import fr.eql.Project_Cda_Alapage.entity.OrderLine;
import fr.eql.Project_Cda_Alapage.entity.Textbook;
import fr.eql.Project_Cda_Alapage.entity.User;
import fr.eql.Project_Cda_Alapage.entity.dto.AuthenticationSiteDto;
import fr.eql.Project_Cda_Alapage.entity.dto.OrderDto;
import fr.eql.Project_Cda_Alapage.entity.dto.OrderLineDto;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookDto;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookForOrderDto;
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
/*
Création NewOrder en fonction de l'Id utilisateur connecté
    → Mettre les infos par défaut
*/
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


    // TEST ENCOURS → Méthod
    @Override
    public List<OrderLine>  addNewOrderline(List<TextbookForOrderDto> textbooksAddedByClientList) {
        System.out.println("********** rentrer ");

        // 1 - Récupération des informations du client
        Authentication actualAuthentication = SecurityContextHolder.getContext().getAuthentication();
        String userLogin = actualAuthentication.getName();
        Order orderAssociatedToActualUser = orderRepository.findOrderByUser(userLogin);

        //2 -
        List<OrderLine> allOrderlinesToAdd = new ArrayList<>();


        //2 - Récupération du manuel à partir de la liste select par le client :
        for (int i = 0; i < textbooksAddedByClientList.size(); i++) {
            System.out.println("******* test 1 : je rentre dans la boucle");
            TextbookForOrderDto eachTextbookDto = textbooksAddedByClientList.get(i);
            Textbook textbookFound = new Textbook(
                    eachTextbookDto.getIdTextbook(),
                    eachTextbookDto.getPriceTextbook(),
                    eachTextbookDto.getReferenceTextbook(),
                    eachTextbookDto.getTitleTextbook(),
                    eachTextbookDto.getEducationLevelTextbook(),
                    eachTextbookDto.getSubjectTextbook(),
                    eachTextbookDto.getStatusTextbook(),
                    eachTextbookDto.getIsbn(),
                    eachTextbookDto.getYearEditionTextbook(),
                    eachTextbookDto.getPicture());
            OrderLineDto orderLineDto = new OrderLineDto();
            //3 - Ajout de ligne Order
            OrderLine orderLineToAdd = new OrderLine(
                    orderLineDto.getIdOrderLine(),
                    eachTextbookDto.getQuantityTextbook(),
                    textbookFound,
                    orderAssociatedToActualUser
            );
            System.out.println("******* test 2 : " + orderAssociatedToActualUser);
            allOrderlinesToAdd.add(orderLineRepository.save(orderLineToAdd));
        }
        return allOrderlinesToAdd;
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
