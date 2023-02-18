public class Salle {
    private String nom;
    private int numero;
    private int capacite;
    private Seance[] seances;

    public Salle(String nom, int numero, int capacite, Seance[] seances) {
        this.nom = nom;
        this.numero = numero;
        this.capacite = capacite;
        this.seances = seances;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Seance[] getSeances() {
        return seances;
    }

    public void setSeances(Seance[] seances) {
        this.seances = seances;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affichier_Program() {
        System.out.println("Notre Programme : ");
        for (int i = 0; i < seances.length; i++) {
            System.out.println("\n\tLa seance n" + (i + 1) + " :");
            seances[i].affichierSeance();
        }
    }

}
