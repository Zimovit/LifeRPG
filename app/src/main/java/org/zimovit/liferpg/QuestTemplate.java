package org.zimovit.liferpg;

import androidx.annotation.NonNull;
import androidx.annotation.StringDef;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Entity
public class QuestTemplate {

    //part with constants

    //quest types
    @Ignore
    public static final String SINGLE = "Single";
    @Ignore
    public static final String SET = "Set";
    @Ignore
    public static final String REPEATING = "Repeating";

    @StringDef ({SINGLE, SET, REPEATING})
    @Retention(RetentionPolicy.SOURCE)
    public @interface QuestType{}

    //quest category
    //TODO fill these categories

    //end of constants

    @NonNull
    @PrimaryKey
    public String questName;

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

    //constructor


    @Ignore
    public QuestTemplate(@NonNull String questName){
        this.questName = questName;
        this.strength = 0;
        this.health = 0;
        this.knowledge = 0;
        this.intellect = 0;
        this.charisma = 0;
        this.category = SINGLE;
        this.type = "type";
    }

    public QuestTemplate(@NonNull String questName, int strength, int health, int knowledge,
                         int intellect, int charisma, String category, String type) {
        this.questName = questName;
        this.strength = strength;
        this.health = health;
        this.knowledge = knowledge;
        this.intellect = intellect;
        this.charisma = charisma;
        this.category = category;
        this.type = type;
    }
}
