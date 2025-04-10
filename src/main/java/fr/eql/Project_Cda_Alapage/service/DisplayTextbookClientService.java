package fr.eql.Project_Cda_Alapage.service;

import fr.eql.Project_Cda_Alapage.entity.Textbook;


import java.util.List;

public interface DisplayTextbookClientService {

    List<Textbook> displayAvailableTextbooks();

    List<Textbook> getTextbooksSelectedByClient(String login);


}
