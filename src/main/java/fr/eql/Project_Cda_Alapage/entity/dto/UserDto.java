package fr.eql.Project_Cda_Alapage.entity.dto;

public class UserDto {
    /////////////////
    /// ATTRIBUTS  ///
    /////////////////

    private final Long idUser;
    private final String surnameUser;
    private final String lastNameUser;
    private final String email;
    private final String password;

    //////////////////////////////
    /// CONSTRUCTEUR SURCHARGÉ ///
    //////////////////////////////

    public UserDto(Long idUser, String surnameUser, String lastNameUser, String email, String password) {
        this.idUser = idUser;
        this.surnameUser = surnameUser;
        this.lastNameUser = lastNameUser;
        this.email = email;
        this.password = password;
    }

    /////////////////////////
    /// GETTER - Accesseurs ///
    /////////////////////////




}
