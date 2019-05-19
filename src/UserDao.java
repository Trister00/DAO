import com.mongodb.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class UserDao implements DAO<User> {
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://Nassim:swing-123@mycluster-dt5it.mongodb.net/test?retryWrites=true"));

    List<User> u = new ArrayList<>();

    public Optional<User> get(long id){
        return Optional.ofNullable(u.get((int) id));
    }


    public List<DBObject> getAll() {
        List<DBObject> u = new ArrayList<>();
        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("User");
        DBCursor cursor = collection.find();
        while (cursor.hasNext()){
            DBObject obj = cursor.next();
            u.add(obj);
        }
        return u;
    }


    public void save(User u) {
        //this.h.add(h);
        SimpleDateFormat formater = new SimpleDateFormat("yyyyMMddHHmmss");
        Date aujourdhui = new Date();
        DBObject user = new BasicDBObject("id",formater.format(aujourdhui))
                .append("nom",u.getNom())
                .append("prenom",u.getPrenom())
                .append("civilite",u.getCivilite())
                .append("mail",u.getMail());
        DB database = this.mongoClient.getDB("Projet");
        DBCollection collection = database.getCollection("User");
        collection.insert(user);
    }


    public void update(User u, String[] params) {

    }


    public void delete(User u) {

    }
}
