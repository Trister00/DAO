import com.mongodb.DBObject;

import java.util.List;
import java.util.Optional;

public interface DAO<O>{
    Optional<O> get(long id);
    List<DBObject> getAll();
    void save(O o);
    void update(O o, String[] params);

    void delete(O o);
}