import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Optional;

public class HebergementApplication {
    private static DAO HebeDao;

    public static void main(String[] args) {
        HebeDao = new HebergementDao();

        Hebergement heb = getHebergement(0);
        System.out.println(heb);
        HebeDao.update(heb, new String[]{"Jake", "jake@domain.com"});

        Hebergement heb2 = getHebergement(1);
        HebeDao.delete(heb2);
       // HebeDao.save(new Hebergement(3,"appart","sudsud",4));

        System.out.println(HebeDao.getAll());
        Hebergement h = new Hebergement(1,"appart","nord",4,200,new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()),new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()));
        HebeDao.save(h);

        Hebergement h2 = new Hebergement(2,"bungalows","nord",2,400,new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()),new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()));
        HebeDao.save(h2);
    }

    private static Hebergement getHebergement(long id) {
        Optional<Hebergement> h = HebeDao.get(id);

        return h.orElseGet(
                () -> new Hebergement(0 ,"not found","not found",0,0,null,null));
    }


}
