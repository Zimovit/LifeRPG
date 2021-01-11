package org.zimovit.liferpg;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserEntity {

    @NonNull
    @PrimaryKey
    public String nickname;

    public long experience;

    //characteristic section
    public int strengthLevel;
    public long strength;

    public int healthLevel;
    public long health;

    public int knowledgeLevel;
    public long knowledge;

    public int intellectLevel;
    public long intellect;

    public int charismaLevel;
    public long charisma;

    //equipment
    public String body;
    public String hands;
    public String feet;
    public String head;

    //constructor

    /**
     * Never mean to use it, but just in case
     * It creates instance of user class with nickname "unknown",
     * zeroed digital values an empty Strings
     */
    public UserEntity(){
        this.nickname = "unknown";
        this.experience = 0;
        this.strengthLevel = 0;
        this.strength = 0;
        this.healthLevel = 0;
        this.health = 0;
        this.knowledgeLevel = 0;
        this.knowledge = 0;
        this.intellectLevel = 0;
        this.intellect = 0;
        this.charismaLevel = 0;
        this.charisma = 0;
        this.body = "";
        this.hands = "";
        this.feet = "";
        this.head = "";
    }


    /**
     * Sets String argument as user's nicknames, all other values
     * sets as zeroes and empty strings
     * @param nickname
     */
    public UserEntity(String nickname){
        this.nickname = "unknown";
        this.experience = 0;
        this.strengthLevel = 0;
        this.strength = 0;
        this.healthLevel = 0;
        this.health = 0;
        this.knowledgeLevel = 0;
        this.knowledge = 0;
        this.intellectLevel = 0;
        this.intellect = 0;
        this.charismaLevel = 0;
        this.charisma = 0;
        this.body = "";
        this.hands = "";
        this.feet = "";
        this.head = "";
    }


    /**
     * Full-body user constructor
     * @param nickname
     * @param experience
     * @param strengthLevel
     * @param strength
     * @param healthLevel
     * @param health
     * @param knowledgeLevel
     * @param knowledge
     * @param intellectLevel
     * @param intellect
     * @param charismaLevel
     * @param charisma
     * @param body
     * @param hands
     * @param feet
     * @param head
     */
    public UserEntity(@NonNull String nickname, long experience, int strengthLevel, long strength,
                      int healthLevel, long health, int knowledgeLevel, long knowledge,
                      int intellectLevel, long intellect, int charismaLevel, long charisma,
                      String body, String hands, String feet, String head) {
        this.nickname = nickname;
        this.experience = experience;
        this.strengthLevel = strengthLevel;
        this.strength = strength;
        this.healthLevel = healthLevel;
        this.health = health;
        this.knowledgeLevel = knowledgeLevel;
        this.knowledge = knowledge;
        this.intellectLevel = intellectLevel;
        this.intellect = intellect;
        this.charismaLevel = charismaLevel;
        this.charisma = charisma;
        this.body = body;
        this.hands = hands;
        this.feet = feet;
        this.head = head;
    }
}
