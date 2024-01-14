package DAO;


    public interface DataSourceFactory {
        CommonDataSource createDataSource(String type);
    }

