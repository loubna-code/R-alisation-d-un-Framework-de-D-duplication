package DAO;

import java.sql.Connection;

public class SingleDatabaseConnector  {
    private static final SingleDatabaseConnector  instance = new SingleDatabaseConnector ();
    private Connection connection;

    private SingleDatabaseConnector () {
        // Initialise la connexion à la base de données
        // (à adapter en fonction de votre logique)
        //this.connection = // Initialisation de la connexion;
    }

    public static SingleDatabaseConnector  getInstance() {
        return instance;
    }

    public Connection connect() {
        // Logique de connexion à la base de données
        return this.connection;
    }
}

