package org.zimovit.liferpg;

import android.app.Application;

import androidx.room.Room;

public class MainApp extends Application {
    public static MainApp instance;

    private AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
        database = Room.databaseBuilder(this, AppDatabase.class, "database").build();
    }

    public static MainApp getInstance() {
        return instance;
    }

    public AppDatabase getDatabase() {
        return database;
    }
}
