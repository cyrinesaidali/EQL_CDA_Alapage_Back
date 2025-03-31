package fr.eql.Project_Cda_Alapage.service.impl;

import fr.eql.Project_Cda_Alapage.entity.Textbook;
import fr.eql.Project_Cda_Alapage.entity.User;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookDto;

import fr.eql.Project_Cda_Alapage.repository.TextbookRepository;
import fr.eql.Project_Cda_Alapage.service.SpaceAdminService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpaceAdminServiceImpl implements SpaceAdminService {
    private TextbookRepository textbookRepository;
    private static final Logger logger = LogManager.getLogger();


    @Override
    public Textbook addTextbook(TextbookDto textbookDto) {
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
        logger.info(textbookAdded);
        System.out.println(textbookAdded);
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
