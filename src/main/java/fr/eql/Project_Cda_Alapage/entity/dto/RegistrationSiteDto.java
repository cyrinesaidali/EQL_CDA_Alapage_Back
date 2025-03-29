package fr.eql.Project_Cda_Alapage.entity.dto;

import fr.eql.Project_Cda_Alapage.entity.enums.RoleName;

public class RegistrationSiteDto {

/////////////////
/// Attributs ///
/////////////////

    private String surnameUser;
    private String lastNameUser;
    private String email;
    private String password;
    private RoleName roleName;

//////////////////////////////
/// GETTER - Accesseurs///
//////////////////////////////

    public String getSurnameUser() {
        return surnameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public RoleName getRoleName() {
        return roleName;
    }


//////////////////////////////
///SETTER - Mutateurs ///
//////////////////////////////
}
