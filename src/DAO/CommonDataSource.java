package DAO;

// interface commune (CommonDataSource) ,chaque source de données doit implémenter.
// Cette interface doit contenir les méthodes nécessaires pour interagir avec la source de données.
import javax.xml.transform.Result;

public interface CommonDataSource {
        Result executeQuery(String query);

    }

