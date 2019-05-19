import java.text.SimpleDateFormat;
import java.util.Date;

public class Hebergement {
    private long id;
    private String type;
    private String localisation;
    private int nb_max_personnes;
    private int prix_nuit;
    private String date_debut;
    private String date_fin;

    public Hebergement(long id, String type, String localisation, int nb_max_personnes, int prix_nuit, String date_debut, String date_fin) {
        this.id = id;
        this.type = type;
        this.localisation = localisation;
        this.nb_max_personnes = nb_max_personnes;
        this.prix_nuit = prix_nuit;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public int getPrix_nuit() {
        return prix_nuit;
    }

    public void setPrix_nuit(int prix_nuit) {
        this.prix_nuit = prix_nuit;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getNb_max_personnes() {
        return nb_max_personnes;
    }

    public void setNb_max_personnes(int nb_max_personnes) {
        this.nb_max_personnes = nb_max_personnes;
    }

    @Override
    public String toString() {
        return "Hebergement{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", localisation='" + localisation + '\'' +
                ", nb_max_personnes=" + nb_max_personnes +
                '}';
    }
}
