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
