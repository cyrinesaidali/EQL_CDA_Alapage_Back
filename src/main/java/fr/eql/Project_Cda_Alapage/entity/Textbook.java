package fr.eql.Project_Cda_Alapage.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import fr.eql.Project_Cda_Alapage.entity.enums.EducationLevelTextbook;
import fr.eql.Project_Cda_Alapage.entity.enums.StatusTextbook;
import fr.eql.Project_Cda_Alapage.entity.enums.SubjectTextbook;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Manuel_Scolaire")
public class Textbook {
/////////////////
/// Attributs ///
/////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_manuel")
    private Long idTextbook;

    @Column(name="prix_manuel")
    private Float priceTextbook;

    @Column(name="ref_manuel")
    private String referenceTextbook;

    @Column(name="titre_manuel")
    private String titleTextbook;

    @Column(name="classe_sco_manuel")
    @Enumerated(EnumType.STRING)
    private EducationLevelTextbook educationLevelTextbook ;

    @Column(name="sujet_manuel")
    @Enumerated(EnumType.STRING)
    private SubjectTextbook subjectTextbook;

    @Column(name="statut_dispo_manuel")
    @Enumerated(EnumType.STRING)
    private StatusTextbook statusTextbook;

    @Column(name="isbn")
    private String isbn;

    @Column(name="annee_edition_manuel")
    @JsonFormat(pattern = "yyyy")
    private Date yearEditionTextbook;

    @Column(name="photo_manuel")
    private String picture;


    /// Jointures avec JPA
/*
→ JsonIgnore : permet de ne pas appeler la donnée lors de la sérialisation/ désérialisation de l'objet :
Permet de l'ignorer au niveau des requêtes / impl

→ Ici, relations mises en bidirectionnelles, donc l'un appelle l'autre et vice versa
Donc besoin d'une mise en place Cascade MERGE ET PERSIST → Pour mettre en place les données + jointures au niveau de l'éditeur
de textoBook (cf explication Jeanne)
Ici, je veux tout récupérer d'éditeur, pour après voir ce que je veux sélectionner → FetchType : eager
*/

    @ManyToOne(cascade =  {CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.EAGER)
    @JoinColumn(name="id_editeur")
    private EditorTextbook editorTextbook;

    @OneToMany(mappedBy = "textbook")
    private List<OrderLine> orderLineListTwo = new ArrayList<>();

//    private Date dateRegistrationTextbook;

//////////////////////////////
/// CONSTRUCTEUR SURCHARGÉ ///
//////////////////////////////

    public Textbook(Long idTextbook, Float priceTextbook, String referenceTextbook, String titleTextbook, EducationLevelTextbook educationLevelTextbook, SubjectTextbook subjectTextbook, StatusTextbook statusTextbook, String isbn, Date yearEditionTextbook, String picture) {
        this.idTextbook = idTextbook;
        this.priceTextbook = priceTextbook;
        this.referenceTextbook = referenceTextbook;
        this.titleTextbook = titleTextbook;
        this.educationLevelTextbook = educationLevelTextbook;
        this.subjectTextbook = subjectTextbook;
        this.statusTextbook = statusTextbook;
        this.isbn = isbn;
        this.yearEditionTextbook = yearEditionTextbook;
        this.picture = picture;
    }

    //////////////////////////////
/// CONSTRUCTEUR VIDE ///
//////////////////////////////
    public Textbook() {  }

    //////////////////////////////
/// GETTER - Accesseurs///
//////////////////////////////

    public Long getIdTextbook() {
        return idTextbook;
    }

    public String getIsbn() {
        return isbn;
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

    public Date getYearEditionTextbook() {
        return yearEditionTextbook;
    }

    public EditorTextbook getEditorTextbook() {
        return editorTextbook;
    }

    public String getPicture() {
        return picture;
    }



    ////////////
///SETTER -  ///
//////////////////


}
