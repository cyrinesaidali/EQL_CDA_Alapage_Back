package fr.eql.Project_Cda_Alapage.entity.dto;

import fr.eql.Project_Cda_Alapage.entity.enums.RoleName;
import jakarta.persistence.Column;

import java.util.Date;

public class RegistrationSiteDto {

/////////////////
/// Attributs ///
/////////////////

    private String surnameUser;
    private String lastNameUser;
    private String login;
    private String password;
    private RoleName roleName;
    private String email;
    private Long phoneNumber;
    private Date birthdateUser;
    private String address;


//////////////////////////////
/// GETTER - Accesseurs///
//////////////////////////////

    public String getSurnameUser() {
        return surnameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
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

    public String getEmail() {
        return email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Date getBirthdateUser() {
        return birthdateUser;
    }

    public String getAddress() {
        return address;
    }

    //////////////////////////////
///SETTER - Mutateurs ///
//////////////////////////////


}
