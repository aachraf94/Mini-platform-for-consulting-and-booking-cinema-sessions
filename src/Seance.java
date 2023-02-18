public class Seance {
    private int numero;
    private String date;
    private String heur_d;
    private String heur_f;
    private double tarif;
    private Film film;
    private int nb_p_libres;

    public Seance(int numero, String date, String heur_d, String heur_f, double tarif, Film film, int nb_p_libres) {
        this.numero = numero;
        this.date = date;
        this.heur_d = heur_d;
        this.heur_f = heur_f;
        this.tarif = tarif;
        this.film = film;
        this.nb_p_libres = nb_p_libres;
    }

    public void affichierSeance() {
        this.film.afficherFilm();
        System.out
                .println("La date : " + date + "       Heure de debut : " + heur_d + "       Heure de fin : " + heur_f);
        System.out.println("Tarif : " + tarif + "DA               Le nombre de place disponible : " + nb_p_libres);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNb_p_libres() {
        return nb_p_libres;
    }

    public void setNb_p_libres(int nb_p_libres) {
        this.nb_p_libres = nb_p_libres;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeur_d() {
        return heur_d;
    }

    public void setHeur_d(String heur_d) {
        this.heur_d = heur_d;
    }

    public String getHeur_f() {
        return heur_f;
    }

    public void setHeur_f(String heur_f) {
        this.heur_f = heur_f;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
