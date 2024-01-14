package DAO.EXEL;


import DAO.CommonDataSource;

import javax.xml.transform.Result;

// Adaptateur pour EXELDataSource
public class EXELDataSourceAdapter implements CommonDataSource {
    private EXELDataSource ExelDataSource;

    public EXELDataSourceAdapter(EXELDataSource exelDataSource) {
        this.ExelDataSource = exelDataSource;
    }

    @Override
    public Result executeQuery(String query) {
        return ExelDataSource.executeQuery(query);
    }
}
