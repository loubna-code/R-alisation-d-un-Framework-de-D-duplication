package DAO.NoSQL;

import DAO.CommonDataSource;

import javax.xml.transform.Result;

// Classe spécifique à NoSQL
public class NoSQLDataSource implements CommonDataSource {
    // Implémentation spécifique à BDR
    @Override
    public Result executeQuery(String query) {
        // Logique d'exécution de la requête pour BDR
        return null;
    }
}
