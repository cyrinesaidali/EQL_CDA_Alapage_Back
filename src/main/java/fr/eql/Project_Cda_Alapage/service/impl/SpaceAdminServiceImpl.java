package fr.eql.Project_Cda_Alapage.service.impl;

import fr.eql.Project_Cda_Alapage.entity.Textbook;
import fr.eql.Project_Cda_Alapage.service.SpaceAdminService;
import org.springframework.beans.factory.annotation.Autowired;

public class SpaceAdminServiceImpl implements SpaceAdminService {
    private Textbook textbook;



    ///////////////
    /// SETTERS ///
    ///////////////

    @Autowired
    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }


}
