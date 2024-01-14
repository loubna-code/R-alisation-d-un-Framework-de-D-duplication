package DAO;

import DAO.BDR.BDRDataSource;
import DAO.BDR.BDRDataSourceAdapter;
import DAO.EXEL.EXELDataSource;
import DAO.EXEL.EXELDataSourceAdapter;
import DAO.NoSQL.NoSQLDataSource;
import DAO.NoSQL.NoSQLDataSourceAdapter;

public class DataSourceFactoryImplementation implements DataSourceFactory{

    @Override
    public CommonDataSource createDataSource(String type) {
        switch (type.toLowerCase()) {
            case "exel":
                return new EXELDataSource();
            case "exelAdapter":
                return new EXELDataSourceAdapter(new EXELDataSource()) ;
            case "bdr":
                return new BDRDataSource();
            case "bdrAdapter":
                return new BDRDataSourceAdapter(new BDRDataSource());
            case "nosqlAdapter":
                return new NoSQLDataSourceAdapter(new NoSQLDataSource());
            case "nosql":
                return new NoSQLDataSource();
            // Ajoutez d'autres cas pour les différents types de bases de données et adapteurs
            default:
                throw new IllegalArgumentException("Type de base de données inconnu : " + type);
        }
    }
}
