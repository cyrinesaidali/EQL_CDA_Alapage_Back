package fr.eql.Project_Cda_Alapage.service;

import fr.eql.Project_Cda_Alapage.entity.Textbook;
import fr.eql.Project_Cda_Alapage.entity.dto.TextbookDto;

import java.util.List;

public interface SpaceAdminService {

    Textbook addTextbook(TextbookDto textbookDto);

    List<Textbook> displayAllTextbook();

    void deleteTextBook(TextbookDto textbookDto);

//void modifyTextbook();




}
