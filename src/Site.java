
//import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Site {
    private String nom;
    private String adresse;
    private Salle[] salles;
    private int[] NosClients;
    private int nb_client_fid;
    private int[][] list_reserve;
    private int nb_reserv;

    public Site(String nom, String adresse, Salle[] salles, int[] Nosclients, int[][] list_reserve) {
        this.nom = nom;
        this.adresse = adresse;
        this.salles = salles;
        this.nb_client_fid = 0;
        this.nb_reserv = 0;
        this.NosClients = Nosclients;
        this.list_reserve = list_reserve;
    }

    public void consulter() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Consulter Nos seances :");
        for (Salle salle : salles) {
            System.out.println("\n\n_____________________________________________________");
            System.out.println("La salle " + salle.getNom() + " :");
            salle.affichier_Program();
            System.out.println("\n\n_____________________________________________________");
            System.out.println("Appuyez sur Entrée pour continuer...");
            sc.nextLine();

        }

    }

    public void client_fidele(Clien clien) {
        if (NosClients != null) {
            if (clien.getNb_seance_assiste() > 25) {
                this.NosClients[nb_client_fid] = clien.getNumClient();
                this.nb_client_fid++;
            }
        }
    }

    public int reserver() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donnez votre num ID : ");
        int id = sc.nextInt();

        System.out.print("Les salles : \n1-Ibn khaldoun\n2-COSMOS\n3-Riadh El Feth\n");
        System.out.print("Donnez le num de la salle : ");
        int nsalle = sc.nextInt();
        System.out.print("Donnez le numero de la seance : ");
        int num_seance = sc.nextInt();

        if (idExisteFid(id)) {
            switch (nsalle) {
                case 1:
                    int n_seance = ExisteSeance(salles[0], num_seance);
                    if (n_seance != (-1)) {
                        Seance S = salles[0].getSeances()[n_seance];
                        if (S.getNb_p_libres() > 0) {
                            S.setNb_p_libres(S.getNb_p_libres() - 1);
                            System.out.println("\nLa réservation est bien fait !");
                            System.out.println("Votre Tarif est : " + (S.getTarif() * 0.95)
                                    + "DA\t(avec remise 5% pour les clients fidele)");
                            this.list_reserve[this.nb_reserv][0] = id;
                            this.list_reserve[this.nb_reserv][1] = n_seance;
                            this.nb_reserv++;
                            return id;
                        } else {
                            System.out.println("Malheuresement il y a pas des places libres !");
                        }
                    }
                    break;
                case 2:
                    n_seance = ExisteSeance(salles[1], num_seance);
                    if (n_seance != (-1)) {
                        Seance S = salles[1].getSeances()[n_seance];
                        if (S.getNb_p_libres() > 0) {
                            S.setNb_p_libres(S.getNb_p_libres() - 1);
                            System.out.println("La réservation est bien fait !");
                            System.out.println("Votre Tarif est : " + (S.getTarif() * 0.95)
                                    + "DA\t(avec remise 5% pour les clients fidele)");
                            this.list_reserve[this.nb_reserv][0] = id;
                            this.list_reserve[this.nb_reserv][1] = n_seance;
                            this.nb_reserv++;
                            return id;
                        } else {
                            System.out.println("Malheuresement il y a pas des places libres !");
                        }
                    }
                    break;
                case 3:
                    n_seance = ExisteSeance(salles[2], num_seance);
                    if (n_seance != (-1)) {
                        Seance S = salles[2].getSeances()[n_seance];
                        if (S.getNb_p_libres() > 0) {
                            S.setNb_p_libres(S.getNb_p_libres() - 1);
                            System.out.println(
                                    "La réservation est bien fait !\t(avec remise 5% pour les clients fidele)");
                            System.out.println("Votre Tarif est : " + (S.getTarif() * 0.95) + "DA");
                            this.list_reserve[this.nb_reserv][0] = id;
                            this.list_reserve[this.nb_reserv][1] = n_seance;
                            this.nb_reserv++;
                            return id;
                        } else {
                            System.out.println("Malheuresement il y a pas des places libres !");
                        }
                    }
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("Vous ne pouvez pas réserver Malheuresemtn Monsieur/Madame ");
        }
        return -1;
    }

    boolean idExisteFid(int num) {
        int i = 0;
        while (i < nb_client_fid) {
            if (num == NosClients[i]) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }

    int ExisteSeance(Salle s, int n) {
        int i = 0;
        Seance[] Gs = s.getSeances();
        while (i < Gs.length) {
            int num = Gs[i].getNumero();
            if (n == num) {
                return i;
            } else {
                i++;
            }
        }
        return (-1);
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

    public int[] getNosClients() {
        return NosClients;
    }

    public void setNosClients(int[] nosClients) {
        NosClients = nosClients;
    }

    public int getNb_client_fid() {
        return nb_client_fid;
    }

    public void setNb_client_fid(int nb_client_fid) {
        this.nb_client_fid = nb_client_fid;
    }

    public int[][] getList_reserve() {
        return list_reserve;
    }

    public void setList_reserve(int[][] list_reserve) {
        this.list_reserve = list_reserve;
    }

    public int getNb_reserv() {
        return nb_reserv;
    }

    public void setNb_reserv(int nb_reserv) {
        this.nb_reserv = nb_reserv;
    }
}
