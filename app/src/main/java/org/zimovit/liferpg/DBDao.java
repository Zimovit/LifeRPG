package org.zimovit.liferpg;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DBDao {
    @Insert
    void insertQuest(Quest quest);

    @Insert
    void insertAllQuests(Quest... quests);

    @Delete
    void deleteQuest(Quest quest);

    @Query("SELECT * FROM Quest")
    List<Quest> getAllQuests();
}
