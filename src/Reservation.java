import com.mongodb.DBObject;

import java.util.Date;

public class Reservation {
    User user;
    Hebergement hebergement;
    Restauration resetauration;
    String date_debut;
    String date_fin;
    long montant;
    int resolu;

    public Reservation(User user, Hebergement hebergement, Restauration resetauration, String date_debut, String date_fin, long montant, int resolu) {
        this.user = user;
        this.hebergement = hebergement;
        this.resetauration = resetauration;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.montant = montant;
        this.resolu = resolu;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Hebergement getHebergement() {
        return hebergement;
    }

    public void setHebergement(Hebergement hebergement) {
        this.hebergement = hebergement;
    }

    public Restauration getResetauration() {
        return resetauration;
    }

    public void setResetauration(Restauration resetauration) {
        this.resetauration = resetauration;
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

    public long getMontant() {
        return montant;
    }

    public void setMontant(long montant) {
        this.montant = montant;
    }

    public int getResolu() {
        return resolu;
    }

    public void setResolu(int resolu) {
        this.resolu = resolu;
    }
}
