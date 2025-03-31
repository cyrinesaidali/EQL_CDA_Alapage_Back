package fr.eql.Project_Cda_Alapage.entity.dto;

import fr.eql.Project_Cda_Alapage.entity.enums.RoleName;

public class RegistrationSiteDto {

/////////////////
/// Attributs ///
/////////////////

    private String surnameUser;
    private String lastNameUser;
    private String email;
    private String login;
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

    public String getLogin() {
        return login;
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

    public void setSurnameUser(String surnameUser) {
        this.surnameUser = surnameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoleName(RoleName roleName) {
        this.roleName = roleName;
    }
}
