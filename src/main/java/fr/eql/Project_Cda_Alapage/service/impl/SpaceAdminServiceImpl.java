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

@Service
public class SpaceAdminServiceImpl implements SpaceAdminService {
    private static final Logger logger = LogManager.getLogger();
    private TextbookRepository textbookRepository;

    @Override
    public Textbook addTextbook(TextbookDto textbookDto) {

    /*
    existByref → Méthode spé mise en place avec JPA

     */

        if (textbookRepository.existByReference(textbookDto.getReferenceTextbook()) != null) {
            logger.error("Manuel scolaire avec la référence : {} existe déjà.", textbookDto.getIdTextbook());
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Manuel scolaire avec la référence " + textbookDto.getReferenceTextbook() + " existe déjà.");
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
                textbookDto.getIsbn(),
                textbookDto.getYearEditionTextbook(),
                admin,
                textbookDto.getEditorTextbook()
                );
        return textbookRepository.save(textbookAdded);
    }

    ///////////////
    /// SETTERS ///
    ///////////////

    @Autowired
    public void setTextbookRepository(TextbookRepository textbookRepository) {
        this.textbookRepository = textbookRepository;
    }
}
