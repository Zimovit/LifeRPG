package org.zimovit.liferpg;

import android.os.AsyncTask;
import android.util.Log;

import java.util.List;

public class DBAsyncQuery extends AsyncTask<Integer, Void, String[]> {
    //Queries
    public static final int GET_ALL = 0;
    public static final int ADD_ALL = 1;
    private Quest[] toProcess;
    private String [] result;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        toProcess = OtherFragment.toDeal;

    }

    @Override
    protected String[] doInBackground(Integer... integers) {
        switch (integers[0]) {
            case GET_ALL:
                List<Quest> quests = DBInstance.getInstance().getDatabase().dbDao().getAllQuests();
                result = new String[quests.size()];
                for (int i = 0; i < quests.size(); i++){
                    result[i] = quests.get(i).questName;
                }
                return result;
            case ADD_ALL:
                DBInstance.getInstance().getDatabase().dbDao().insertAllQuests(toProcess);
                result = new String[toProcess.length];
                for (int i = 0; i < toProcess.length; i++){
                    result[i] = toProcess[i].questName;
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
        OtherFragment.toDeal = null;
    }
}
