package DAO.NoSQL;

import DAO.BDR.BDRDataSource;
import DAO.CommonDataSource;

import javax.xml.transform.Result;

// Adaptateur pour NoSQLDataSource
public class NoSQLDataSourceAdapter implements CommonDataSource {
    private NoSQLDataSource nosqlDataSource;

    public NoSQLDataSourceAdapter(NoSQLDataSource nosQLDataSource) {
        this.nosqlDataSource = nosQLDataSource;
    }

    @Override
    public Result executeQuery(String query) {
        return nosqlDataSource.executeQuery(query);
    }
}
