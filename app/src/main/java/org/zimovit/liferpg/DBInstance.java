package org.zimovit.liferpg;

import android.app.Application;

import androidx.room.Room;

public class DBInstance extends Application {
    public static DBInstance instance;

    private AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
        database = Room.databaseBuilder(this, AppDatabase.class, "database").build();
    }

    public static DBInstance getInstance() {
        return instance;
    }

    public AppDatabase getDatabase() {
        return database;
    }
}
