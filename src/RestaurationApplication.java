import java.util.Optional;

public class RestaurationApplication {
    private static DAO RestDao;
    public static void main(String[] args) {
        RestDao = new RestaurationDao();


        System.out.println(RestDao.getAll());
        Restauration r= new Restauration(1,"demi pension","petit-dejeuner ou un repas");
        RestDao.save(r);

        Restauration r2 = new Restauration(2,"pension complete","petit-dejeuner et un repas");
        RestDao.save(r2);
    }


}
