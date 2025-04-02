package fr.eql.Project_Cda_Alapage.service.impl;

import fr.eql.Project_Cda_Alapage.entity.Order;
import fr.eql.Project_Cda_Alapage.entity.OrderLine;

import fr.eql.Project_Cda_Alapage.entity.User;
import fr.eql.Project_Cda_Alapage.entity.dto.OrderLineDto;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookDto;
import fr.eql.Project_Cda_Alapage.repository.OrderLineRepository;
import fr.eql.Project_Cda_Alapage.repository.TextbookRepository;
import fr.eql.Project_Cda_Alapage.service.DisplayTextbookClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisplayTextbookClientServiceImpl implements DisplayTextbookClientService {

    private static final Logger logger = LogManager.getLogger();

    private TextbookRepository textbookRepository;

    private OrderLineRepository orderLineRepository;


/*  Affichage only des livres disponibles pour tout le monde (client et admin) :
- Je reçois la liste de livres en String avec méthodes findAll
Puis, j'ajoute dans ma liste de String mes livres qui ne sont que disponibles + affichage avec la requête
*/
    @Override
    public List<String> displayAvailableTextbooks() {
        List<String> allTextbookList = textbookRepository.findAllTextbook();
        List<String> textbookAvailableList = textbookRepository.findByAvailibility(allTextbookList);
        return textbookAvailableList;
    }

    //A MODIFIER car il faut que j'ajoute le textbook selectionné et la commande
    @Override
    public OrderLine addNewOrderline(OrderLineDto orderLineDto) {
        User client = new User();
        OrderLine orderLineToAdd = new OrderLine(
                orderLineDto.getIdOrderLine(),
                orderLineDto.getQuantityTextbook(),
                orderLineDto.getTextbook(),
                orderLineDto.getOrder());
        return orderLineRepository.save(orderLineToAdd);
    }

    @Override
    public OrderLine addTextbookInOrderline(TextbookDto textbookDto) {
// Je dois créer la ligne de commande avec OrderLineDto
//Puis, j'ajoute à ma ligne de commande un manuel
        return null;
    }

    @Override
    public Order createNewOrder(Order order) {
        return null;
    }


    ///////////////////////////
    /// SETTERS - AUTOWIRED ///
    //////////////////////////
    @Autowired
    public void setTextbookRepository(TextbookRepository textbookRepository) {
        this.textbookRepository = textbookRepository;
    }

}
