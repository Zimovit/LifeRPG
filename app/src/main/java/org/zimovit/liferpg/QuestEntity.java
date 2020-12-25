package org.zimovit.liferpg;

import androidx.annotation.StringDef;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Entity
public class QuestEntity {

    //part with constants

    //quest types
    public static final String SINGLE = "Single";
    public static final String SET = "Set";
    public static final String REPEATING = "Repeating";

    @StringDef ({SINGLE, SET, REPEATING})
    @Retention(RetentionPolicy.SOURCE)
    public @interface QuestType{}

    //quest category
    //TODO fill these categories

    //end of constants

    @PrimaryKey
    public String QuestName;

    //characteristic affection
    public int strength;
    public int health;
    public int knowledge;
    public int intellect;
    public int charisma;

    //quest category
    public String category;

    //quest type
    public String type;

    //average time of quest's completion
    public String averageCompletionTime;
    //TODO implement parsing method
}
