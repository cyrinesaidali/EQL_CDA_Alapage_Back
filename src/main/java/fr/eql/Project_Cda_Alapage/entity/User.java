package fr.eql.Project_Cda_Alapage.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import fr.eql.Project_Cda_Alapage.entity.enums.ReasonClosingAccount;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Utilisateur")
public class User implements UserDetails {

/////////////////
/// ATTRIBUTS  ///
/////////////////

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_utilisateur")
    private Long idUser;

    @Column(name="prenom_utilisateur")
    private String surnameUser;

    @Column(name = "nom_utilisateur")
    private String lastNameUser;

    @Column(name = "naissance_utilisateur")
    private Date birthdateUser;

    @Column(name = "adresse_utilisateur")
    private String address;

    @Column(name = "telephone_utilisateur")
    private Long phoneNumber;

    @Column(name = "email")
    private String email;

    @JsonIgnore
    @Column(name = "login")
    private String login;

    @JsonIgnore
    @Column(name = "mdp")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "raison_ferme_utilisateur")
    private ReasonClosingAccount reasonClosingAccount;

////// Jointures avec JPA :

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Order> orderList = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Textbook> textbookList = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "Utilisateur_Role", joinColumns = {@JoinColumn(name = "id_utilisateur")}, inverseJoinColumns = {@JoinColumn(name = "id_role")})
    private List<Role> rolesList = new ArrayList<>();

//    private Date dateClosingAccountUser;
//    private Date dateRegistrationUser;


//////////////////////////////
/// CONSTRUCTEUR SURCHARGÉ ///
//////////////////////////////
    public User(String surnameUser, String lastNameUser, Date birthdateUser, String address, Long phoneNumber, String email, String login, String password, ReasonClosingAccount reasonClosingAccount) {
        this.surnameUser = surnameUser;
        this.lastNameUser = lastNameUser;
        this.birthdateUser = birthdateUser;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.login = login;
        this.password = password;
        this.reasonClosingAccount = reasonClosingAccount;
    }

    //////////////////////////////
/// CONSTRUCTEUR VIDE ///
//////////////////////////////

    public User() {
    }

//////////////////////////////
/// MÉTHODES : Nécessaire pour permettre l'authentification via Spring Secu///
//////////////////////////////

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        this.rolesList.forEach(role -> authorities.add(new SimpleGrantedAuthority(role.getRoleName())));
        return authorities;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }




//////////////////////////////
/// GETTER - Accesseurs///
//////////////////////////////

    public Long getIdUser() {
        return idUser;
    }

    public String getSurnameUser() {
        return surnameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public List<Role> getRolesList() {
        return rolesList;
    }



//////////////////////////////
///SETTER - Mutateurs ///
//////////////////////////////


    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public void setSurnameUser(String surnameUser) {
        this.surnameUser = surnameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRolesList(List<Role> rolesList) {
        this.rolesList = rolesList;
    }
}
