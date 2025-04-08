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
    private String groupEditor;

    @Column(name="adresse_Editeur")
    private String addressEditorTextbook;

    @Column(name="telephone_editeur")
    private Long phoneNumberEditorTextbook;

    @Column(name="siret_editeur")
    private String siretEditorTextbook;

    ////// Jointures avec JPA :
    @OneToMany(mappedBy = "editorTextbook")
    private List<Textbook> textbookList = new ArrayList<>();

//////////////////////////////
/// CONSTRUCTEUR SURCHARGÉ ///
//////////////////////////////

    public EditorTextbook(Long idEditorTextbook, String nameEditorTextbook, String groupEditor, String addressEditorTextbook, Long phoneNumberEditorTextbook, String siretEditorTextbook) {
        this.idEditorTextbook = idEditorTextbook;
        this.nameEditorTextbook = nameEditorTextbook;
        this.groupEditor = groupEditor;
        this.addressEditorTextbook = addressEditorTextbook;
        this.phoneNumberEditorTextbook = phoneNumberEditorTextbook;
        this.siretEditorTextbook = siretEditorTextbook;
    }

    //////////////////////////////
/// CONSTRUCTEUR VIDE ///
//////////////////////////////

    public EditorTextbook() {
    }

    //////////////////////////////
/// GETTER - Accesseurs///
//////////////////////////////

public Long getIdEditorTextbook() {
        return idEditorTextbook;
    }

    public String getNameEditorTextbook() {
        return nameEditorTextbook;
    }

//////////////////////////////
///SETTER -  ///
//////////////////////////////


}
