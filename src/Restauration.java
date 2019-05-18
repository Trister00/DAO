public class Restauration {
    private int id;
    private String type;
    private String details;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Restauration(int id, String type, String details) {
        this.id = id;
        this.type = type;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Restauration{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
