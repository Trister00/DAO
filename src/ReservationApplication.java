import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Optional;

public class ReservationApplication {
    private static DAO ResDAO;

    public static void main(String[] args) {
        ResDAO = new ReservationDao();

        Reservation r = new Reservation(
                new User("Benghanem","Saad","M","saad@gmail.com"),
                new Hebergement(2,"appart","nord",4,200,new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()),new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime())),
                new Restauration(1,"pension complete","tout inclus"),
                new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()),
                new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()),
                500,
                20
        );

        ResDAO.save(r);

    }


}
