package org.zimovit.liferpg.temp;

import org.zimovit.liferpg.Quest;

public abstract class SampleQuestSet {

    public static Quest[] generateSetOfQuests(){
        Quest[] result = new Quest[10];
        for (int i = 0; i < 10; i++){
            Quest quest = new Quest("Test" + Integer.toString(i));
        }

        return result;
    }
}
