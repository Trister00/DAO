import java.util.Date;

public class User {
    private Date id;
    private String nom;
    private String prenom;
    private String civilite;
    private String mail;

    public User(String nom, String prenom, String civilite, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
        this.mail = mail;
    }

    public Date getId() {
        return id;
    }

    public void setId(Date id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
