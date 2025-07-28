package fr.eql.Project_Cda_Alapage.entity.enums;

public enum EducationLevelTextbook {
    CP("CP"),
    CE1("CE1"),
    CE2("CE2"),
    CM1("CM1"),
    CM2("CM2"),
    SIXIEME("Sixième"),
    CINQUIEME("Cinquième"),
    QUATRIEME("Quatrième"),
    TROISIEME("Troisième");

    private final String displayEducationLevelTextbook;

    EducationLevelTextbook(String displayEducationLevelTextbook) {
        this.displayEducationLevelTextbook = displayEducationLevelTextbook;
    }

    public String getDisplayEducationLevelTextbook() {
        return displayEducationLevelTextbook;
    }
}
