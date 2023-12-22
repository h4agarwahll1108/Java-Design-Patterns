package com.harshit1108.Adapter;

public class AdapteeDatabase {

    private String databaseName;

    private String query;

    public AdapteeDatabase() {
    }

    public void getDatabaseName() {
        System.out.println(this.databaseName);
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void getQuery() {
        System.out.println(this.query);
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
