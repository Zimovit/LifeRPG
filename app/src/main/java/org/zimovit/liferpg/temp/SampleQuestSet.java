package org.zimovit.liferpg.temp;

import android.util.Log;

import org.zimovit.liferpg.Quest;

public abstract class SampleQuestSet {

    public static Quest[] generateSetOfQuests(){
        Quest[] result = new Quest[10];
        for (int i = 0; i < 10; i++){
            result[i] = new Quest("Test" + Integer.toString(i));
        }
        return result;
    }
}
