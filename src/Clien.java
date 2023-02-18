public class Clien {

    // constater film
    // 2 class fils client_normal client_fidèle
    protected int numClient;
    protected int nb_seance_assiste;

    public Clien(int numClient, int nb_seance_assiste) {
        this.numClient = numClient;
        this.nb_seance_assiste = nb_seance_assiste;
    }

    public int getNumClient() {
        return numClient;
    }

    public void setNumClient(int numClient) {
        this.numClient = numClient;
    }

    public int getNb_seance_assiste() {
        return nb_seance_assiste;
    }

    public void setNb_seance_assiste(int nb_seance_assiste) {
        this.nb_seance_assiste = nb_seance_assiste;
    }

    public void AffichierClient() {
        System.out.println("Num Client : " + numClient);
        System.out.println("Nombre de seance assisté : " + nb_seance_assiste);
    }

    public void incNbSeanceAssiste() {
        this.nb_seance_assiste++;
    }

}