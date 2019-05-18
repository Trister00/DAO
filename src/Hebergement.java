public class Hebergement {
    private long id;
    private String type;
    private String localisation;
    private int nb_max_personnes;

    public Hebergement(long id, String type, String localisation, int nb_max_personnes) {
        this.id = id;
        this.type = type;
        this.localisation = localisation;
        this.nb_max_personnes = nb_max_personnes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public int getNb_max_personnes() {
        return nb_max_personnes;
    }

    public void setNb_max_personnes(int nb_max_personnes) {
        this.nb_max_personnes = nb_max_personnes;
    }

    @Override
    public String toString() {
        return "Hebergement{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", localisation='" + localisation + '\'' +
                ", nb_max_personnes=" + nb_max_personnes +
                '}';
    }
}
