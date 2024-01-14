package DAO.BDR;

import DAO.CommonDataSource;

import javax.xml.transform.Result;

// Adaptateur pour BDRDataSource
public class BDRDataSourceAdapter implements CommonDataSource {
    private BDRDataSource bdrDataSource;

    public BDRDataSourceAdapter(BDRDataSource bdrDataSource) {
        this.bdrDataSource = bdrDataSource;
    }

    @Override
    public Result executeQuery(String query) {
        return bdrDataSource.executeQuery(query);
    }
}
