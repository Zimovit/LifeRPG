package org.zimovit.liferpg;

import androidx.room.Entity;

@Entity
public class Quest extends QuestTemplate {

    public long overallCompletionTime;
    public int timesCompleted;

    public Quest(String questName, int strength, int health, int knowledge, int intellect, int charisma, String category, String type) {
        super(questName, strength, health, knowledge, intellect, charisma, category, type);

        overallCompletionTime = 0;
        timesCompleted = 0;
    }
}
