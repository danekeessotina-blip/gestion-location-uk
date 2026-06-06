import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n===== GESTION DE LOCATION =====");
            System.out.println("1. Ajouter");
            System.out.println("2. Modifier");
            System.out.println("3. Supprimer");
            System.out.println("4. Afficher");
            System.out.println("5. Rechercher");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");

            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Fonction Ajouter");
                    break;

                case 2:
                    System.out.println("Fonction Modifier");
                    break;

                case 3:
                    System.out.println("Fonction Supprimer");
                    break;

                case 4:
                    System.out.println("Fonction Afficher");
                    break;
		case 5:
		    System.out.println("Fonction Rechercher");
                    break;
                case 6:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

        } while (choix != 6);

        sc.close();
    }
}
