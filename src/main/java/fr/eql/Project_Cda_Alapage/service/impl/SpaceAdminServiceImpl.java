package fr.eql.Project_Cda_Alapage.service.impl;

import fr.eql.Project_Cda_Alapage.entity.Textbook;
import fr.eql.Project_Cda_Alapage.entity.User;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookDto;

import fr.eql.Project_Cda_Alapage.repository.TextbookRepository;
import fr.eql.Project_Cda_Alapage.service.SpaceAdminService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SpaceAdminServiceImpl implements SpaceAdminService {
    private static final Logger logger = LogManager.getLogger();
    private TextbookRepository textbookRepository;

////existByref → Méthode spé mise en place avec JPA
/// Méthode pour ajouter un manuel scolaire au sein de la BDD
    @Override
    public Textbook addTextbook(TextbookDto textbookDto) {
        if (textbookRepository.existByIsbn(textbookDto.getIsbn()) != null) {
            logger.error("Manuel scolaire avec l'ISBN : {} existe déjà.", textbookDto.getIsbn());
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Manuel scolaire avec l'ISBN " + textbookDto.getIsbn() + " existe déjà.");
        }
        User admin = new User();
        admin.setIdUser(textbookDto.getUserId());
        Textbook textbookAdded = new Textbook(
                textbookDto.getIdTextbook(),
                textbookDto.getPriceTextbook(),
                textbookDto.getReferenceTextbook(),
                textbookDto.getTitleTextbook(),
                textbookDto.getEducationLevelTextbook(),
                textbookDto.getSubjectTextbook(),
                textbookDto.getStatusTextbook(),
                textbookDto.getIsbn(),
                textbookDto.getYearEditionTextbook(),
                textbookDto.getPicture()
                );
        return textbookRepository.save(textbookAdded);
    }

    /// Méthode pour ajouter un manuel scolaire au sein de la BDD
    @Override
    public List<Textbook> displayAllTextbook() {
        return textbookRepository.findAll();
    }

    /// Méthode pour supprimer un textbook en fonction de l'ISBN (findByIsbn → cf Requête)
    @Override
    public void deleteTextBook(TextbookDto textbookDto) {
        Textbook textbookToDelete = textbookRepository.findByIsbn(textbookDto.getIsbn());
        textbookRepository.delete(textbookToDelete);
    }

    ///////////////////////////
    /// SETTERS - AUTOWIRED ///
    //////////////////////////
    @Autowired
    public void setTextbookRepository(TextbookRepository textbookRepository) {
        this.textbookRepository = textbookRepository;
    }
}
