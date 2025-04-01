package fr.eql.Project_Cda_Alapage.entity.dto;

import fr.eql.Project_Cda_Alapage.entity.EditorTextbook;
import fr.eql.Project_Cda_Alapage.entity.enums.EducationLevelTextbook;
import fr.eql.Project_Cda_Alapage.entity.enums.SubjectTextbook;

import java.util.Date;


public class TextbookDto {

    private Long idTextbook;

    private Float priceTextbook;

    private String referenceTextbook;

    private String titleTextbook;

    private EducationLevelTextbook educationLevelTextbook ;

    private SubjectTextbook subjectTextbook;

    private String isbn;

    private Date yearEditionTextbook;

    private EditorTextbook editorTextbook;

    private long userId;

    //////////////////////////////
    /// CONSTRUCTEUR SURCHARGÉ ///
    //////////////////////////////

    public TextbookDto(Long idTextbook, Float priceTextbook, String referenceTextbook, String titleTextbook, EducationLevelTextbook educationLevelTextbook, SubjectTextbook subjectTextbook, String isbn, Date yearEditionTextbook, EditorTextbook editorTextbook, long userId) {
        this.idTextbook = idTextbook;
        this.priceTextbook = priceTextbook;
        this.referenceTextbook = referenceTextbook;
        this.titleTextbook = titleTextbook;
        this.educationLevelTextbook = educationLevelTextbook;
        this.subjectTextbook = subjectTextbook;
        this.isbn = isbn;
        this.yearEditionTextbook = yearEditionTextbook;
        this.editorTextbook = editorTextbook;
        this.userId = userId;
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

    public String getIsbn() {
        return isbn;
    }

    public Date getYearEditionTextbook() {
        return yearEditionTextbook;
    }

    public EditorTextbook getEditorTextbook() {
        return editorTextbook;
    }

    public long getUserId() {
        return userId;
    }



    /////////////////////////
    /// SETTER  /
    /////////////////////////


}
