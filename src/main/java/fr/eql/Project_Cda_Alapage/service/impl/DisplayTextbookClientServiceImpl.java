package fr.eql.Project_Cda_Alapage.service.impl;

import fr.eql.Project_Cda_Alapage.entity.Textbook;
import fr.eql.Project_Cda_Alapage.entity.User;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookDto;
import fr.eql.Project_Cda_Alapage.repository.OrderLineRepository;
import fr.eql.Project_Cda_Alapage.repository.TextbookRepository;
import fr.eql.Project_Cda_Alapage.repository.UserRepository;
import fr.eql.Project_Cda_Alapage.service.DisplayTextbookClientService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisplayTextbookClientServiceImpl implements DisplayTextbookClientService {

    private static final Logger logger = LogManager.getLogger();

    private TextbookRepository textbookRepository;

    private UserRepository userRepository;


/*  Affichage only des livres disponibles pour tout le monde (client et admin) :
- Je reçois la liste de livres en String avec méthodes findAll
Puis, j'ajoute dans ma liste de String mes livres qui ne sont que disponibles + affichage avec la requête
*/
    @Override
    public List<Textbook> displayAvailableTextbooks() {
        List<Textbook> allTextbookList = textbookRepository.findAll();
        List<Textbook> textbookAvailableList = textbookRepository.findByAvailibility(allTextbookList);
        return textbookAvailableList;
    }

    //ENCORE EN TEST → A lier avec le FRONT
    @Override
    public List<Textbook> getTextbooksSelectedByClient(String login) {
        //Permet d'avoir les informations de l'utilisateur authentifié
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        login = authentication.getName();
        logger.info("Nom d'utilisateur : " + authentication.getName() + "\r\n Autorités (Rôles) : " + authentication.getAuthorities());
        User actualClient = userRepository.findByLogin(login);


        List<Textbook> listTextbooksSelectedByUser = new ArrayList<>();
//        do {
//            for (int i = 0; i < textbookDto.hashCode(); i++) {
//                listTextbooksSelectedByUser.add(textbookDto);
//            }
//        } while (textbookDto.equals(true) );
//        textbookDto.;
         return listTextbooksSelectedByUser;
    }


    ///////////////////////////
    /// SETTERS - AUTOWIRED ///
    //////////////////////////
    @Autowired
    public void setTextbookRepository(TextbookRepository textbookRepository) {
        this.textbookRepository = textbookRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
