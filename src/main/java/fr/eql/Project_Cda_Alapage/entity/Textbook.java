package fr.eql.Project_Cda_Alapage.entity;

import fr.eql.Project_Cda_Alapage.entity.enums.EducationLevelTextbook;
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

//    @Column(name="editeur_manuel")
//    private EditorTextbook editorTextbook; //JavaClass

    @Column(name="isbn")
    private String isbn;

    @Column(name="annee_edition_manuel")
    private Date yearEditionTextbook;

    @ManyToMany(mappedBy = "textbookList", cascade = CascadeType.ALL)
    private List<Order> orderList = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_editeur")
    private EditorTextbook editorTextbook;

//    private Date dateRegistrationTextbook;



//////////////////////////////
/// CONSTRUCTEUR SURCHARGÉ ///
//////////////////////////////


//////////////////////////////
/// CONSTRUCTEUR VIDE ///
//////////////////////////////

//////////////////////////////
/// GETTER - Accesseurs///
//////////////////////////////

//////////////////////////////
///SETTER -  ///
//////////////////////////////
}
