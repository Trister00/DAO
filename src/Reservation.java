import com.mongodb.DBObject;

import java.util.Date;

public class Reservation {
    DBObject user;
    DBObject hebergement;
    DBObject resetauration;
    Date date_debut;
    Date date_fin;
    long montant;
    int resolu;

    public Reservation(DBObject user, DBObject hebergement, DBObject resetauration, Date date_debut, Date date_fin, long montant, int resolu) {
        this.user = user;
        this.hebergement = hebergement;
        this.resetauration = resetauration;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.montant = montant;
        this.resolu = resolu;
    }

    public DBObject getUser() {
        return user;
    }

    public void setUser(DBObject user) {
        this.user = user;
    }

    public DBObject getHebergement() {
        return hebergement;
    }

    public void setHebergement(DBObject hebergement) {
        this.hebergement = hebergement;
    }

    public DBObject getResetauration() {
        return resetauration;
    }

    public void setResetauration(DBObject resetauration) {
        this.resetauration = resetauration;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
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
