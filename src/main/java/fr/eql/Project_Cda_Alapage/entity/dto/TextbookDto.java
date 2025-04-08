package fr.eql.Project_Cda_Alapage.entity.dto;

import fr.eql.Project_Cda_Alapage.entity.EditorTextbook;
import fr.eql.Project_Cda_Alapage.entity.enums.EducationLevelTextbook;
import fr.eql.Project_Cda_Alapage.entity.enums.StatusTextbook;
import fr.eql.Project_Cda_Alapage.entity.enums.SubjectTextbook;

import java.util.Date;


public class TextbookDto {
    //////////////////////////////
    /// ATTRIBUTS///
    ///////////////

    private Long idTextbook;

    private Float priceTextbook;

    private String referenceTextbook;

    private String titleTextbook;

    private EducationLevelTextbook educationLevelTextbook ;

    private SubjectTextbook subjectTextbook;

    private StatusTextbook statusTextbook;

    private String isbn;

    private Date yearEditionTextbook;

    private EditorTextbook editorTextbook;

    private long userId;

    private String picture;



    //////////////////////////////
    /// CONSTRUCTEUR SURCHARGÉ ///
    //////////////////////////////

    public TextbookDto(Long idTextbook, Float priceTextbook, String referenceTextbook, String titleTextbook, EducationLevelTextbook educationLevelTextbook, SubjectTextbook subjectTextbook, StatusTextbook statusTextbook, String isbn, Date yearEditionTextbook, EditorTextbook editorTextbook, long userId, String picture) {
        this.idTextbook = idTextbook;
        this.priceTextbook = priceTextbook;
        this.referenceTextbook = referenceTextbook;
        this.titleTextbook = titleTextbook;
        this.educationLevelTextbook = educationLevelTextbook;
        this.subjectTextbook = subjectTextbook;
        this.statusTextbook = statusTextbook;
        this.isbn = isbn;
        this.yearEditionTextbook = yearEditionTextbook;
        this.editorTextbook = editorTextbook;
        this.userId = userId;
        this.picture = picture;
    }

    public TextbookDto() {
    }

    /////////////////////////
    /// GETTER - Accesseurs /
    /////////////////////////

    public Long getIdTextbook() {
        return idTextbook;
    }

    public Float getPriceTextbook() {
        return priceTextbook;
    }

    public String getReferenceTextbook() {
        return referenceTextbook;
    }

    public String getTitleTextbook() {
        return titleTextbook;
    }

    public EducationLevelTextbook getEducationLevelTextbook() {
        return educationLevelTextbook;
    }

    public SubjectTextbook getSubjectTextbook() {
        return subjectTextbook;
    }

    public StatusTextbook getStatusTextbook() {
        return statusTextbook;
    }

    public String getIsbn() {
        return isbn;
    }

    public Date getYearEditionTextbook() {
        return yearEditionTextbook;
    }

    public EditorTextbook getEditorTextbook() {
        return editorTextbook;
    }

    public String getPicture() {
        return picture;
    }

    public long getUserId() {
        return userId;
    }





    /////////////////////////
    /// SETTER  /
    /////////////////////////


}
