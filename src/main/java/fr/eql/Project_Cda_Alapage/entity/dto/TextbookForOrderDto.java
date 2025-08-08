package fr.eql.Project_Cda_Alapage.entity.dto;



import fr.eql.Project_Cda_Alapage.entity.enums.EditorTextbook;
import fr.eql.Project_Cda_Alapage.entity.enums.EducationLevelTextbook;
import fr.eql.Project_Cda_Alapage.entity.enums.StatusTextbook;
import fr.eql.Project_Cda_Alapage.entity.enums.SubjectTextbook;

import java.util.Date;

public class TextbookForOrderDto {

////////////////
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

    private Long quantityTextbook;


    //////////////////////////////
    /// CONSTRUCTEUR SURCHARGÉ ///
    //////////////////////////////

    public TextbookForOrderDto(Long idTextbook, Float priceTextbook, String titleTextbook, StatusTextbook statusTextbook, String isbn, Long quantityTextbook) {
        this.idTextbook = idTextbook;
        this.priceTextbook = priceTextbook;
        this.titleTextbook = titleTextbook;
        this.statusTextbook = statusTextbook;
        this.isbn = isbn;
        this.quantityTextbook = quantityTextbook;
    }





    public TextbookForOrderDto() {
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

    public long getUserId() {
        return userId;
    }

    public String getPicture() {
        return picture;
    }

    public Long getQuantityTextbook() {
        return quantityTextbook;
    }
}
