package Alignement;

import DAO.CommonDataSource;

public class ImporterData {
    private CommonDataSource dataSource;

    public ImporterData(CommonDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void importData() {
        // Logique d'importation des données avec la source de données
        System.out.println("Importation des données avec la source de données.");
        // Utilisation de la source de données pour l'importation
        // (à adapter en fonction de votre logique)
    }

}
