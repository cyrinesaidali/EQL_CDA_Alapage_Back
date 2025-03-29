package fr.eql.Project_Cda_Alapage.entity;

import fr.eql.Project_Cda_Alapage.entity.enums.RoleName;
import jakarta.persistence.*;

@Entity
@Table(name="Role")
public class Role {
    /////////////////
    /// Attributs ///
    /////////////////

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_role")
    private Long idRole;

    @Enumerated(EnumType.STRING)
    RoleName roleName;


//////////////////////////////
/// CONSTRUCTEUR SURCHARGÉ ///
//////////////////////////////

    public Role(RoleName roleName) {
        this.roleName = roleName;
    }

    //////////////////////////////
/// CONSTRUCTEUR VIDE ///
//////////////////////////////

    public Role() {
        }

//////////////////////////////
/// GETTER ///
//////////////////////////////

    public String getRoleName() {
        return roleName.toString();
    }

    //////////////////////////////
///SETTER -  ///
//////////////////////////////
}
