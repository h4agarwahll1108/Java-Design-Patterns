package com.harshit1108.Adapter;

// Adapter: DatabaseAdapter
//2nd way of Doing extending AdapteeDatabase and using this. Instead of using has-a relationship.
class DatabaseAdapter implements TargetDatabase {
    private final AdapteeDatabase adapteeDatabase;

    public DatabaseAdapter(AdapteeDatabase adapteeDatabase) {
        this.adapteeDatabase = adapteeDatabase;
    }

    @Override
    public void connect() {
        adapteeDatabase.getDatabaseName();
    }

    @Override
    public void executeQuery() {
        adapteeDatabase.getQuery();
    }
}
