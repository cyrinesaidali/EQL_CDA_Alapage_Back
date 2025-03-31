package fr.eql.Project_Cda_Alapage.entity.dto;

public class UserDto {
    /////////////////
    /// ATTRIBUTS  ///
    /////////////////

    private final Long idUser;
    private final String surnameUser;
    private final String lastNameUser;
    private final String token;

    //////////////////////////////
    /// CONSTRUCTEUR SURCHARGÉ ///
    //////////////////////////////

    public UserDto(Long idUser, String surnameUser, String lastNameUser, String token) {
        this.idUser = idUser;
        this.surnameUser = surnameUser;
        this.lastNameUser = lastNameUser;
        this.token = token;
    }

    /////////////////////////
    /// GETTER - Accesseurs ///
    /////////////////////////

    public Long getIdUser() {
        return idUser;
    }

    public String getSurnameUser() {
        return surnameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public String getToken() {
        return token;
    }
}
