package com.harshit1108.Adapter;
/**
 * Adapter patterns comes under structural pattern as it deals with how classes are interacting.
 * As name suggests adapter pattern is used adapt two different incompatible system.
 *
 * Adapter pattern also helps and be connector between your system and some third party or legacy system.
 * For example your system expects data in one format to process and third party sends in one format.
 * Example : Consider you have to invoke some third party soap service which is xml base however your system is built on JSON
 * with some advanced fields at that time you create JSON-to-XML adapter which will help to interact with thirdparty.
 * Adapter pattern can be achieved in two ways :
 * 1. Class Level: class level mean to adapt something you are extending and doing inheritance of that class.
 * 2. Object level : Object level mean you keep has-a relationship with class rather doing tight coupling in system.
 */
public class Main {
    public static void main(String[] args) {
        // Your existing database connector (Adaptee)
        AdapteeDatabase adapteeDatabase = new AdapteeDatabase();
        adapteeDatabase.setDatabaseName("MYSQL");
        adapteeDatabase.setQuery("select * from table");

        // New database connector with the desired interface (Target)
        DatabaseAdapter databaseAdapter = new DatabaseAdapter(adapteeDatabase);
        databaseAdapter.connect();
        databaseAdapter.executeQuery();
    }
}