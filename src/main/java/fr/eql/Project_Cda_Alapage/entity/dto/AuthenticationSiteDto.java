package fr.eql.Project_Cda_Alapage.entity.dto;

public class AuthenticationSiteDto {

/////////////////
/// Attributs ///
/////////////////
    private String login;
    private String password;


//////////////////////////////
/// GETTER - Accesseurs ///
//////////////////////////////

    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }

//////////////////////////////
///SETTER - Mutateurs ///
//////////////////////////////
    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
