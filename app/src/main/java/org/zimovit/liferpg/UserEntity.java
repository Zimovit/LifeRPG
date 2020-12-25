package org.zimovit.liferpg;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class UserEntity {

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
}
