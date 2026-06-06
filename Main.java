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
                    public void modifier(int id,string client,string materiel,int duree)
{

       for (Location l:locations) {

     if (l.getId() ==id) {

    l.setClient(client);
    l.setMateriel(materiel);
    l.setDuree(duree);

    System.out.println("Location modifiée!");
  return;

  } 
 }

system.out.println("location introuvable!");

}

                    break;

                case 3:
                    
System.out.println("Fonction supprimer");

                    break;

                case 4:
                    public void afficher() {

    if (locations.isEmpty()) {
        System.out.println("⚠ Aucune location enregistrée.");
        return;
    }

    System.out.println("\n===== LISTE DES LOCATIONS =====");

    for (Location l : locations) {
        System.out.println(l);
    }
}
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
