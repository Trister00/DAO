import com.mongodb.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class HebergementDao implements DAO<Hebergement> {


    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://JavaFX:swing-123@cluster0-reg43.mongodb.net/test?retryWrites=true"));



    private List<Hebergement> h = new ArrayList<>();

    public HebergementDao(){
        h.add(new Hebergement(1,"appart","nord",4,200,new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()),new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime())));
        h.add(new Hebergement(2,"bungalows","nord",2,400,new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()),new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime())));

    }
    public Optional<Hebergement> get(long id){
        return Optional.ofNullable(h.get((int) id));
    }


    public List<DBObject> getAll() {
        List<DBObject> h = new ArrayList<>();
        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("Hebergement");
        DBCursor cursor = collection.find();
        while (cursor.hasNext()){
            DBObject obj = cursor.next();
            h.add(obj);
        }
        return h;
    }


    public void save(Hebergement h) {
        //this.h.add(h);
        DBObject hebergement = new BasicDBObject("id",h.getId())
                .append("type",h.getType())
                .append("localisation",h.getLocalisation())
                .append("nb_max",h.getNb_max_personnes())
                .append("prix",h.getPrix_nuit())
                .append("reserve",Arrays.asList(
                        new BasicDBObject("date_debut",h.getDate_debut())
                                .append("date_fin",h.getDate_fin())
                                , new BasicDBObject("date_debut",h.getDate_debut())
                                .append("date_fin",h.getDate_fin()))
                )
                       ;
                                       ;
        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("Hebergement");
        collection.insert(hebergement);
    }


    public void update(Hebergement h, String[] params) {

    }


    public void delete(Hebergement h) {
        this.h.remove(h);
    }


}
