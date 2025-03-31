package fr.eql.Project_Cda_Alapage.entity;

import fr.eql.Project_Cda_Alapage.entity.enums.RoleName;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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

////// Jointures avec JPA :
    @ManyToMany(mappedBy = "rolesList", cascade = CascadeType.ALL)
    private List <User> userList = new ArrayList<>();

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
