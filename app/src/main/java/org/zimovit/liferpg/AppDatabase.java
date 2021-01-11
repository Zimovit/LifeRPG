package org.zimovit.liferpg;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {UserEntity.class, QuestTemplate.class, Quest.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DBDao dbDao();
}
