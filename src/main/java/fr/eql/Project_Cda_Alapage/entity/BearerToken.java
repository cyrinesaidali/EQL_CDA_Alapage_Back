package fr.eql.Project_Cda_Alapage.entity;

public class BearerToken {


/////////////////
/// Attributs ///
/////////////////
    private final String accessToken;
    private final String accessType;


//////////////////////////////
/// CONSTRUCTEUR SURCHARGÉ ///
//////////////////////////////

    public BearerToken(String accessToken, String accessType) {
        this.accessToken = accessToken;
        this.accessType = accessType;
    }


//////////////////////////////
/// GETTER - Accesseurs///
//////////////////////////////
    public String getAccessToken() {
        return accessToken;
    }

    public String getAccessType() {
        return accessType;
    }


}
