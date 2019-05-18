public class UserApplication {
    private static DAO UserDao;
    public static void main(String[] args){
        UserDao = new UserDao();
        User u1 = new User("EL ALAM","Nassim","M","nassim@gmail.com");
        UserDao.save(u1);

        User u2 = new User("Benghanem","Saad","M","saad@gmail.com");
        UserDao.save(u2);
    }
}
