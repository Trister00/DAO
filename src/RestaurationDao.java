import com.mongodb.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RestaurationDao implements DAO<Restauration> {
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://JavaFX:swing-123@cluster0-reg43.mongodb.net/test?retryWrites=true"));

    List<Restauration> r = new ArrayList<>();

    public Optional<Restauration> get(long id){
        return Optional.ofNullable(r.get((int) id));
    }


    public List<DBObject> getAll() {
        List<DBObject> h = new ArrayList<>();
        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("Restauration");
        DBCursor cursor = collection.find();
        while (cursor.hasNext()){
            DBObject obj = cursor.next();
            h.add(obj);
        }
        return h;
    }


    public void save(Restauration r) {
        //this.h.add(h);
        DBObject restauration = new BasicDBObject("id",r.getId())
                .append("type",r.getType())
                .append("localisation",r.getDetails());
        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("Restauration");
        collection.insert(restauration);
    }


    public void update(Restauration r, String[] params) {

    }


    public void delete(Restauration r) {

    }
}
