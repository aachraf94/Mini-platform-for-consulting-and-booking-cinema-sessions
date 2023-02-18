public class Film {
    private String titre;
    private String annee;
    private String realisateur;
    private String[] acteurs;
    private String synopsis;

    public Film(String titre, String annee, String realisateur, String[] acteurs, String synopsis) {
        this.titre = titre;
        this.annee = annee;
        this.realisateur = realisateur;

        // System.arraycopy(acteurs, 0, this.acteurs, 0, acteurs.length);

        this.acteurs = acteurs;
        this.synopsis = "" + synopsis;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String site) {
        this.titre = site;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String[] getActeurs() {
        return acteurs;
    }

    public void setActeurs(String[] acteurs) {
        this.acteurs = acteurs;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void afficherFilm() {
        System.out.println("Le titre du Film : " + this.titre);
        System.out.println("L'annee de sortir : " + annee);
        System.out.println("Le realisateur : " + realisateur);
        System.out.print("Les acteurs : ");
        for (int i = 0; i < acteurs.length - 1; i++) {
            System.out.print(acteurs[i] + ", ");
        }
        System.out.println(acteurs[acteurs.length - 1] + ".");
        System.out.println("Synopsis : \n" + synopsis);
    }

}