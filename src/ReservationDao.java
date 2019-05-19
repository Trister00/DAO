import com.mongodb.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReservationDao implements DAO<Reservation> {
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://Nassim:swing-123@mycluster-dt5it.mongodb.net/test?retryWrites=true"));

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
        DBObject restauration = new BasicDBObject("user",r.getUser())
                .append("hebergement",r.getHebergement())
                .append("restauration",r.getResetauration())
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
