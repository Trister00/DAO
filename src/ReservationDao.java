import com.mongodb.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class ReservationDao implements DAO<Reservation> {
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://JavaFX:swing-123@cluster0-reg43.mongodb.net/test?retryWrites=true"));

    List<Reservation> r = new ArrayList<>();

    public Optional<Reservation> get(long id){
        return Optional.ofNullable(r.get((int) id));
    }


    public List<DBObject> getAll() {
        List<DBObject> r = new ArrayList<>();
        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("Reservation");
        DBCursor cursor = collection.find();
        while (cursor.hasNext()){
            DBObject obj = cursor.next();
            r.add(obj);
        }
        return r;
    }


    public void save(Reservation r) {
        //this.h.add(h);
        SimpleDateFormat formater = new SimpleDateFormat("yyyyMMddHHmmss");
        Date aujourdhui = new Date();
        DBObject restauration = new BasicDBObject("user",
                new BasicDBObject("id",formater.format(aujourdhui))
                        .append("nom",r.getUser().getNom())
                        .append("prenom",r.getUser().getPrenom())
                        .append("civilite",r.getUser().getCivilite())
                        .append("mail",r.getUser().getMail()))
                .append("hebergement",
                        new BasicDBObject("id",r.getHebergement().getId())
                                .append("type",r.getHebergement().getType())
                                .append("localisation",r.getHebergement().getLocalisation())
                                .append("nb_max",r.getHebergement().getNb_max_personnes())
                                .append("prix",r.getHebergement().getPrix_nuit())
                                )
                .append("restauration",
                        new BasicDBObject("id",r.getResetauration().getId())
                                .append("type",r.getResetauration().getType())
                                .append("localisation",r.getResetauration().getDetails()))
                .append("date_debut",r.getDate_debut())
                .append("date_fin",r.getDate_fin())
                .append("montant",r.getMontant())
                .append("resolu",r.getResolu());
        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("Reservation");
        collection.insert(restauration);
    }


    public void update(Reservation r, String[] params) {

    }


    public void delete(Reservation r) {

    }
}
