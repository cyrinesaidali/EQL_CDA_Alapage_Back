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
                textbookDto.getIsbn(),
                textbookDto.getYearEditionTextbook(),
                textbookDto.getEditorTextbook()
                );
        return textbookRepository.save(textbookAdded);
    }

    @Override
    public List<String> displayAllTextbook() {
        return textbookRepository.findAllTextbook();
    }

    @Override
    public void deleteTextBook(TextbookDto textbookDto) {
        System.out.println("TESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSST");
        Textbook textbookToDelete = textbookRepository.findByIsbn(textbookDto.getIsbn());
        textbookRepository.delete(textbookToDelete);
        logger.info("test");
    }

    ///////////////
    /// SETTERS ///
    ///////////////

    @Autowired
    public void setTextbookRepository(TextbookRepository textbookRepository) {
        this.textbookRepository = textbookRepository;
    }
}
