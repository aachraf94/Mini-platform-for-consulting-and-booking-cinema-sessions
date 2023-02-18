
//import java.awt.*;
//import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Clien cl1 = new Clien(1, 16);
        Clien cl2 = new Clien(2, 0);
        Clien cl3 = new Clien(3, 2);
        Clien cl4 = new Clien(4, 110);
        Clien cl5 = new Clien(5, 16);
        Clien cl6 = new Clien(6, 25);
        Clien cl7 = new Clien(7, 15);
        Clien cl8 = new Clien(8, 55);

        Clien[] NosClient = { cl1, cl2, cl3, cl4, cl5, cl6, cl7, cl8 };

        // Film 01
        String[] acteurs = { "lyna khoudri", "Shirine Boutella", "Yasin Houicha", "Zahra Doumandji", "Aida ghechoud",
                "Meriem Medjkrane", "Nadia Kaci" };
        String synopsis = "Alger, années 90. Nedjma, 18 ans, étudiante habitant la cité universitaire, rêve de devenir styliste.";
        Film f1 = new Film("Papicha", "2019", "Mounia Meddour", acteurs, synopsis);
        // f1.afficherFilm();

        // Film 02
        String[] acteur2 = { "Jean Martin", "Brahim Hadjadj", "Yacef Saâdi" };
        synopsis = "Octobre 1957. Les paras du colonel Mathieu cernent le refuge d'Ali-La-Pointe, responsable de la guérilla urbaine. Pendant ses heures de réclusion forcée, Ali revit l'itinéraire qui l'a conduit de l'état de délinquant et proxénète à celui de chef guérillero du F.L.N. Novembre 1954, l'organisation terroriste entreprend son activité en Algérie; ce sont les premiers attentats à la bombe dans les bars, les gares et les cinémas de la ville européenne.";
        Film f2 = new Film("La Bataille d'Alger", "1966", "Gillo Pontecorvo", acteur2, synopsis);

        // Film 03
        String[] acteur3 = { "Souhila Mallem", "Mehdi Ramdani", "Aziz Boukrouni", "Jacques Serres", "Mustapha Laribi",
                "Vincent de Boüard" };
        synopsis = "Héliopolis est un film dramatique algérien réalisé par Djaffar Gacem et sorti en 2021. Héliopolis est le nom d'un petit village à 5 km de la ville Guelma, où se déroule l'action du film. Le film représente l'Algérie pour l'Oscar du meilleur film international à la 94ᵉ cérémonie des Oscars.";
        Film f3 = new Film("Héliopolis", "2021", "Djaffar Gacem", acteur3, synopsis);
        // f3.afficherFilm();

        // Film 04
        String[] acteur4 = { "Fuaad Aït Aattou", "Anne Parillaud", "Nora Arnezeder", "Vincent Perez", "Marine Vacth",
                "Anne Consigny", "Nicolas Giraud" };
        synopsis = "Algérie, années 1930. Venu de la campagne, Younès, 9 ans, emménage avec sa famille à Oran, après que la terre de son père a été incendiée, puis saisie par un créancier. Mohamed, son oncle pharmacien, et Madeleine, son épouse française en mal d'enfant, prennent le garçon sous leur toit pour l'arracher à la misère qui lui est promise.";
        Film f4 = new Film("Ce que le jour doit à la nuit", "2012", "Alexandre Arcady", acteur4, synopsis);
        // f4.afficherFilm();

        // Film 05
        String[] acteur5 = { "Kate Winslet", "Leonardo DiCaprio", "Billy Zane", "Kathy Bates", "Gloria Stuart",
                "Bill Paxton", "Victor Garber" };
        synopsis = "En 1997, l'épave du Titanic est l'objet d'une exploration fiévreuse, menée par des chercheurs de trésor en quête d'un diamant bleu qui se trouvait à bord. Frappée par un reportage télévisé, l'une des rescapées du naufrage, âgée de 102 ans, Rose DeWitt, se rend sur place et évoque ses souvenirs. 1912.";
        Film f5 = new Film("Titanic", "1997", "James Cameron", acteur5, synopsis);
        // f5.afficherFilm();

        // Film 06
        String[] acteur6 = { "Tanjiro Kamado", "Senjuro Rengoku", "Akaza", "Nezuko Kamado", "Tanjiro Kamado" };
        synopsis = "Le groupe de Tanjirô a terminé son entraînement de récupération au domaine des papillons et embarque à présent en vue de sa prochaine mission à bord du train de l'infini, d'où quarante personnes ont disparu en peu de temps. Tanjirô et Nezuko, accompagnés de Zen'itsu et Inosuke, s'allient à l'un des plus puissants épéistes de l'armée des pourfendeurs de démons, le Pilier de la Flamme Kyôjurô Rengoku, afin de contrer le démon qui a engagé le train de l'Infini sur une voie funeste.";
        Film f6 = new Film("kimetsu no yaiba - le train de l'infini", "2020", " Haruo Sotozaki", acteur6, synopsis);
        // f6.afficherFilm();

        // Film 07
        String[] acteur7 = { "Chris Hemsworth", "Golshifteh Farahani", "Sam Hargrave" };
        synopsis = "Ovi Mahajan, le fils d'un baron de la drogue indien, est capturé par des ennemis de son père. Pour le sauver, on fait appel à Tyler Rake, un mercenaire sans pitié au passé trouble. Arrivé sur place, ce dernier comprend rapidement que cette mission est plus périlleuse qu'il le croyait.";
        Film f7 = new Film("Tyler Rake", "2020", "Sam Hargrave", acteur7, synopsis);
        // f7.afficherFilm();

        Seance s1 = new Seance(1, "28/02/2023", "20h00", "22h00", 2000, f1, 20);
        Seance s2 = new Seance(2, "25/02/2023", "13h00", "15h00", 2500, f2, 101);
        Seance s3 = new Seance(3, "24/02/2023", "16h30", "18h30", 1000, f3, 60);
        Seance s4 = new Seance(4, "20/02/2023", "20h00", "22h00", 2800, f4, 44);
        Seance s5 = new Seance(5, "02/03/2023", "21h00", "23h00", 2200, f5, 70);
        Seance s6 = new Seance(6, "04/03/2023", "20h00", "22h00", 2000, f1, 30);
        Seance s7 = new Seance(7, "12/03/2023", "21h00", "23h00", 1600, f6, 50);
        Seance s8 = new Seance(8, "02/04/2023", "20h00", "22h00", 2500, f7, 90);
        Seance s9 = new Seance(9, "11/04/2023", "20h00", "22h00", 1200, f4, 0);
        Seance s10 = new Seance(10, "14/03/2023", "20h00", "22h00", 4000, f2, 99);
        // s1.affichierSeance();

        Seance[] Gs1 = { s1, s2, s3, s5, s10 };
        Seance[] Gs2 = { s4, s6, s7, s8, s9 };
        Seance[] Gs3 = { s4, s8, s3, s10, s1, s7 };

        Salle salle1 = new Salle("Ibn khaldoun", 1, 300, Gs1);
        Salle salle2 = new Salle("COSMOS", 2, 500, Gs2);
        Salle salle3 = new Salle("Riadh El Feth", 3, 60, Gs3);

        Salle[] SallesCinema = { salle1, salle2, salle3 };
        int[] fid = new int[100];
        int[][] reserv = new int[50][2];

        Site GuideCinema = new Site("GuideCinema", "www.guidecinema.com", SallesCinema, fid, reserv);
        Cinema CinemaAlger = new Cinema("CinemaAlger", "Alger, Algrie", SallesCinema, GuideCinema);

        // les client fidele
        GuideCinema.client_fidele(cl1);
        GuideCinema.client_fidele(cl2);
        GuideCinema.client_fidele(cl3);
        GuideCinema.client_fidele(cl4);
        GuideCinema.client_fidele(cl5);
        GuideCinema.client_fidele(cl6);
        GuideCinema.client_fidele(cl7);
        GuideCinema.client_fidele(cl8);

        int choix = (-1);
        while (choix != 7) {
            System.out.println("\n\n\t**************** Menu ****************");
            System.out.println("\t1- Afficher les clients");
            System.out.println("\t2- Consulter les program de tout les salles");
            System.out.println("\t3- Afficher le program de la salle Ibn khaldoun");
            System.out.println("\t4- Afficher le program de la salle COSMOS");
            System.out.println("\t5- Afficher le program de la salle Riadh El Feth");
            System.out.println("\t6- Réservation un place pour une seance");
            System.out.println("\t7- Quitter");
            System.out.print("\n\t\t Votre choix : ");

            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();

            switch (choix) {
                case 1 -> {
                    // code1
                    for (int i = 0; i < NosClient.length; i++) {
                        System.out.println("Client n" + (i + 1) + " :");
                        NosClient[i].AffichierClient();
                        System.out.println("_________________________");
                        System.out.println("Appuyez sur Entrée pour continuer...");
                        sc.nextLine();
                    }
                }
                case 2 -> {
                    // code
                    GuideCinema.consulter();
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
                case 3 -> {
                    // code
                    salle1.affichier_Program();
                    System.out.println("Appuyez sur Entrée pour continuer...");
                    sc.nextLine();
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
                case 4 -> {
                    // code
                    salle2.affichier_Program();
                    System.out.println("Appuyez sur Entrée pour continuer...");
                    sc.nextLine();
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
                case 5 -> {
                    // code
                    salle3.affichier_Program();
                    System.out.println("Appuyez sur Entrée pour continuer...");
                    sc.nextLine();
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
                case 6 -> {
                    // code
                    int l;
                    l = GuideCinema.reserver();
                    if (l != -1) {
                        NosClient[l - 1].incNbSeanceAssiste();
                    }
                    System.out.println("Appuyez sur Entrée pour continuer...");
                    sc.nextLine();
                    sc.nextLine();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
                case 7 -> {
                    // code
                    // System.out.print("\033[H\033[2J");
                    // System.out.flush();

                    // clear

                    // try {
                    // if (System.getProperty("os.name").contains("Windows")) {
                    // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    // } else {
                    // System.out.print("\033[H\033[2J");
                    // System.out.flush();
                    // }
                    // } catch (IOException | InterruptedException e) {
                    // // handle exceptions
                    // }

                    System.out.println("\n\n\t\tMerci pour votre visite, à la prochaine.\n");
                    System.out.println("\t\t" + CinemaAlger.getNom() + "\t\t" + CinemaAlger.getAdresse());
                    System.out.println("\t\t" + GuideCinema.getAdresse());
                }
            }
        }

    }
}