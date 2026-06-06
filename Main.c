public void supprimer(int id) {

    for (int i = 0; i < locations.size(); i++) {

        if (locations.get(i).getId() == id) {

            locations.remove(i);

            System.out.println(" Location supprimée !");
            return;
        }
    }

    System.out.println(" Location introuvable !");
}
