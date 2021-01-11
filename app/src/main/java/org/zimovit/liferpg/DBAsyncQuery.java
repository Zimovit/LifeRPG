package org.zimovit.liferpg;

import android.os.AsyncTask;

import java.util.List;

public class DBAsyncQuery extends AsyncTask<Integer, Void, String[]> {
    //Queries
    public static final int GET_ALL = 0;

    @Override
    protected String[] doInBackground(Integer... integers) {
        switch (integers[0]) {
            case GET_ALL:
                List<Quest> quests = DBInstance.getInstance().getDatabase().dbDao().getAllQuests();
                String[] result = new String[quests.size()];
                for (int i = 0; i < quests.size(); i++){
                    result[i] = quests.get(i).questName;
                }
                return result;
        }
        return null;
    }

    @Override
    protected void onPostExecute(String[] questsNames) {
        super.onPostExecute(questsNames);
        OtherFragment.items = questsNames;
        OtherFragment.adapter.notifyDataSetChanged();
    }
}
