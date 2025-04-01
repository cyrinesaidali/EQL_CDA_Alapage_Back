package fr.eql.Project_Cda_Alapage.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Editeur")
public class EditorTextbook {

/////////////////
/// Attributs ///
/////////////////

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_editeur")
    private Long idEditorTextbook;

    @Column(name="nom_editeur")
    private String nameEditorTextbook;

    @Column(name="groupe_editeur")
    public String groupEditor;

    @Column(name="adresse_Editeur")
    private String addressEditorTextbook;

    @Column(name="telephone_editeur")
    private Long phoneNumberEditorTextbook;

    @Column(name="siret_editeur")
    private String siretEditorTextbook;

    @Column(name="accreditation_oui")
    private Boolean accreditationNationalEducationEditor;


    ////// Jointures avec JPA :
    @OneToMany(mappedBy = "editorTextbook", fetch = FetchType.LAZY)
    private List<Textbook> textbookList = new ArrayList<>();

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
