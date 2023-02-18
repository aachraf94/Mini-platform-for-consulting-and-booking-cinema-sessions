public class Cinema {

    private String nom;
    private String adresse;
    private Salle[] salles;
    private Site site;

    public Cinema(String nom, String adresse, Salle[] salles, Site site) {
        this.nom = nom;
        this.adresse = adresse;
        this.salles = salles;
        this.site = site;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Salle[] getSalles() {
        return salles;
    }

    public void setSalles(Salle[] salles) {
        this.salles = salles;
    }

}
